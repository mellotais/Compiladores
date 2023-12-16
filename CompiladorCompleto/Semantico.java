package CompiladorCompleto;

import java.util.ArrayList;
import java.util.List;

public class Semantico implements Constants {
    private TabelaDeSimbolos tabelaDeSimbolos = new TabelaDeSimbolos();
    private List<String> semanticErrors = new ArrayList<>();

    public void executeAction(int action, Token token) throws SemanticError {
        String lexeme = token.getLexeme();
        switch (action) {
            case 1: // <TIPOS>
            	TipoDado tipo = TipoDado.valueOf(lexeme.toUpperCase());
                tabelaDeSimbolos.adicionarTipoDado(lexeme, tipo, token.getPosition());
                break;
            case 2: // <ID>
                tabelaDeSimbolos.adicionarVariavelSemTipo(lexeme, token.getPosition());
                break;
            case 3: // <DECLARACAO_VAR>
                tabelaDeSimbolos.adicionarVariavel(lexeme, token.getPosition());
                break;
            case 4: // <ATRIBUICAO>
                verificarAtribuicao(lexeme, token.getPosition());
                break;
        }
    }
    
    private void verificarAtribuicao(String variavel, int position) throws SemanticError {
        if (!tabelaDeSimbolos.contemVariavel(variavel)) {
            throw new SemanticError("Variável não declarada: " + variavel, position);
        }
    }
    
    // método para adicionar mensagens de erro semântico
    public void addSemanticError(String errorMessage) {
        semanticErrors.add(errorMessage);
    }

    // método para obter a lista completa de mensagens de erro semântico
    public List<String> getSemanticErrors() {
        return semanticErrors;
    }
}
