package CompiladorCompleto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringReader;
import java.util.List;

public class Gráfica {
    private JFrame frame;
    private JTextArea textAreaInput;
    private JTextArea textAreaLexical;
    private JTextArea textAreaSyntax;
    private JTextArea textAreaSemantic;
    private JButton btnAnalyze;

    public Gráfica() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Compilador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Adicionar a gramática no início
        JTextArea grammarArea = new JTextArea(
                "<PROGRAMA> ::= programa id ap fp <BLOCO>;\n"+
                "<FOR> ::= for ap int id <FOR1> <FOR2> fp <BLOCO>;\n"+
                "<FOR1> ::=  atri const pv id menorq const pv id incr | î;\n"+
                "<FOR2> ::= dp id | î;\n"+
                "<BLOCO> ::= ac <LISTA_COMANDOS> fc;\n"+
                "<ID_CONSTANTE> ::= id | const;\n"+
                "<LISTA_COMANDOS> ::= <COMANDO> <LISTA_COMANDOS> | î;\n"+
                "<COMANDO> ::=  <DO> | <PRINT> | <READ> | <RETORNO> | <DECLARACAO_VAR> | <IF> | <SWITCH> | <WHILE> | <FOR> | <AT>;\n"+
                "<ATRIBUICAO> ::= atri <EXPR> | î;\n"+
                "<AT> ::= id atri <EXPR> pv;\n"+
                "<DO> ::= do <BLOCO> <WHILE>;\n"+
                "<WHILE> ::= while ap <EXPR> fp <BLOCO>;\n"+
                "<EXPR> ::= <ID_CONSTANTE> <EXPR1>;\n"+
                "<EXPR1> ::= <OPERADORES_ARITMETICOS> <ID_CONSTANTE> | î;\n"+
                "<OPERADORES_ARITMETICOS> ::= soma | mult | sub | div | mod | igual | maiorq | menorq | maiorigual | menorigual;\n"+
                "<TIPO> ::= int | string | char;\n"+
                "<PRINT> ::= print ap <PRINT1> fp pv;\n"+
                "<PRINT1> ::= aspas <PRINT2> aspas | <ID_CONSTANTE>;\n"+
                "<PRINT2> ::= id <PRINT2> | const <PRINT2> | î;\n"+
                "<READ> ::= read ap id fp pv;\n"+
                "<RETORNO> ::= return <EXPR>;\n"+
                "<DECLARACAO_VAR> ::= <TIPO> id <ATRIBUICAO> pv;\n"+
                "<IF> ::= if ap <EXPR> fp <BLOCO> <ELSE>;\n"+
                "<ELSE> ::= else <BLOCO> | î;\n"+
                "<SWITCH> ::= switch ap <ID_CONSTANTE> fp ac <CASE> fc;\n"+
                "<CASE> ::= case ap <ID_CONSTANTE> fp dp <LISTA_COMANDOS> <BREAK> <CASE> | î;\n"+
                "<BREAK> ::= break pv | î;\n"
);

        JScrollPane grammarScrollPane = new JScrollPane(grammarArea);
        mainPanel.add(grammarScrollPane, BorderLayout.NORTH);

        // Painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        JLabel labelInput = new JLabel("Entrada do Programa");
        textAreaInput = new JTextArea();
        inputPanel.add(labelInput, BorderLayout.NORTH);
        inputPanel.add(new JScrollPane(textAreaInput), BorderLayout.CENTER);

        // Painel de resultados
        JPanel resultPanel = new JPanel(new GridLayout(1, 3, 10, 10)); // GridLayout com 1 linha e 3 colunas

        // Rótulos e áreas de texto para cada resultado
        JLabel labelLexical = new JLabel("Resultados Léxicos");
        textAreaLexical = new JTextArea();
        setCustomMargin(textAreaLexical);
        JLabel labelSyntax = new JLabel("Resultados Sintáticos");
        textAreaSyntax = new JTextArea();
        setCustomMargin(textAreaSyntax);
        JLabel labelSemantic = new JLabel("Resultados Semânticos");
        textAreaSemantic = new JTextArea();
        setCustomMargin(textAreaSemantic);

        // botão de análise
        btnAnalyze = new JButton("Analisar");
        btnAnalyze.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAnalyze.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runAnalysis();
            }
        });

        // componentes ao painel de resultados
        resultPanel.add(createResultPanel(labelLexical, textAreaLexical));
        resultPanel.add(createResultPanel(labelSyntax, textAreaSyntax));
        resultPanel.add(createResultPanel(labelSemantic, textAreaSemantic));
        resultPanel.add(btnAnalyze);

        // painéis ao frame
        mainPanel.add(inputPanel, BorderLayout.CENTER);

        // Panel para envolver o resultPanel
        JPanel resultWrapperPanel = new JPanel(new BorderLayout());
        resultWrapperPanel.add(resultPanel, BorderLayout.CENTER);

        mainPanel.add(resultWrapperPanel, BorderLayout.SOUTH);
        frame.getContentPane().add(mainPanel);

        frame.setSize(1200, 700);
        frame.setLocationRelativeTo(null);
    }

    private JPanel createResultPanel(JLabel label, JTextArea textArea) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        return panel;
    }

    private void runAnalysis() {
        String sourceCode = textAreaInput.getText();
        StringReader reader = new StringReader(sourceCode);

        Lexico lexer = new Lexico(sourceCode);
        Semantico semanticAnalyzer = new Semantico();
        Sintatico parser = new Sintatico();

        textAreaLexical.setText("");
        textAreaSyntax.setText("");
        textAreaSemantic.setText("");

        try {
            Token token;
            while ((token = lexer.nextToken()) != null) {
                textAreaLexical.append(token.toString() + "\n");
            }

            lexer.setInput(sourceCode);

            parser.parse(lexer, semanticAnalyzer);

            List<String> semanticErrors = semanticAnalyzer.getSemanticErrors();
            if (semanticErrors.isEmpty()) {
                textAreaSemantic.setText("Análise Semântica: Sem erros.\n");
            } else {
                StringBuilder errorMessage = new StringBuilder("Erros Semânticos:\n");
                for (String error : semanticErrors) {
                    errorMessage.append(error).append("\n");
                }
                textAreaSemantic.setText(errorMessage.toString());
            }
        } catch (LexicalError | SyntaticError | SemanticError e) {
            if (e instanceof LexicalError) {
                LexicalError lexError = (LexicalError) e;
                textAreaLexical.setText("Lexical Error: " + lexError.getMessage() + "\n");
            } else if (e instanceof SyntaticError) {
                SyntaticError synError = (SyntaticError) e;
                textAreaSyntax.setText("Syntax Error: " + synError.getMessage() + "\n");
            } else if (e instanceof SemanticError) {
                SemanticError semError = (SemanticError) e;
                textAreaSemantic.setText("Semantic Error: " + semError.getMessage() + "\n");
     
                textAreaSyntax.setText("Syntax Error: " + semError.getMessage() + "\n");
            }
        }
    }

    private void setCustomMargin(JTextArea textArea) {
       
        textArea.setMargin(new Insets(50, 50, 50, 50));
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Gráfica window = new Gráfica();
                window.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
