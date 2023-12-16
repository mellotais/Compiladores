package CompiladorCompleto;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

enum TipoDado {
    INT,
    CHAR,
    STRING
}

class Simbolo {
    protected String identificador;
    protected String ambito;
    protected int fila;
    protected int columna;

    public Simbolo() {
        identificador = "";
        ambito = "";
        fila = -1;
        columna = -1;
    }

    public Simbolo(String identificador, String ambito, int fila, int columna) {
        this.identificador = identificador;
        this.ambito = ambito;
        this.fila = fila;
        this.columna = columna;
    }

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getAmbito() {
		return ambito;
	}

	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

   
}

class Variaveis extends Simbolo {
    private TipoDado tipo;

    public Variaveis() {
        super();
        tipo = null;
    }

    public Variaveis(String identificador, TipoDado tipo, String ambito, int fila, int columna) {
        super(identificador, ambito, fila, columna);
        this.tipo = tipo;
    }

	public TipoDado getTipo() {
		return tipo;
	}

	public void setTipo(TipoDado tipo) {
		this.tipo = tipo;
	}

    
}

class Funcion extends Simbolo {
    private ArrayList<Variaveis> parametros;
    private TipoDado tipoRetorno;

    public Funcion() {
        super();
        parametros = new ArrayList<>();
        tipoRetorno = null;
    }

    public Funcion(String identificador, String ambito, ArrayList<Variaveis> parametros, TipoDado tipoRetorno,
            int fila, int columna) {
        super(identificador, ambito, fila, columna);
        this.parametros = parametros;
        this.tipoRetorno = tipoRetorno;
    }

	public ArrayList<Variaveis> getParametros() {
		return parametros;
	}

	public void setParametros(ArrayList<Variaveis> parametros) {
		this.parametros = parametros;
	}

	public TipoDado getTipoRetorno() {
		return tipoRetorno;
	}

	public void setTipoRetorno(TipoDado tipoRetorno) {
		this.tipoRetorno = tipoRetorno;
	}

    
}

public class TabelaDeSimbolos {
    private Map<String, TipoDado> tabela = new HashMap<>();
    private Deque<Variaveis> variaveisSemTipo = new LinkedList<>();
    private ArrayList<Simbolo> tabelaSimbolos = new ArrayList<>();
    private ArrayList<Object> parametrosChamada;

    public TabelaDeSimbolos() {
        tabelaSimbolos = new ArrayList<>();
        parametrosChamada = new ArrayList<>();
    }
    
    public void adicionarTipoDado(String identificador, TipoDado tipo, int position) throws SemanticError {
        if (tabela.containsKey(identificador)) {
            throw new SemanticError("Tipo de dado já declarado: " + identificador, position);
        }
        tabela.put(identificador, tipo);
    }

    public void adicionarVariavelSemTipo(String identificador, int position) throws SemanticError {
        if (contemVariavel(identificador)) {
            throw new SemanticError("Variável já declarada: " + identificador, position);
        }
        Variaveis var = new Variaveis(identificador, null, "", -1, -1);
        variaveisSemTipo.add(var);
    }
    

    public void adicionarVariavel(String identificador, int position) throws SemanticError {
        if (contemVariavel(identificador)) {
            throw new SemanticError("Variável já declarada: " + identificador, position);
        }
        if (variaveisSemTipo.isEmpty()) {
            throw new SemanticError("Variável usada sem tipo: " + identificador, position);
        }
        Variaveis varSemTipo = variaveisSemTipo.pop();
        varSemTipo.setFila(position);
        varSemTipo.setColumna(position);
        tabela.put(identificador, varSemTipo.getTipo());
        tabelaSimbolos.add(varSemTipo);
    }

    
    public boolean contemVariavel(String identificador) {
        return tabela.containsKey(identificador);
    }

    public void limparParametrosChamada() {
        parametrosChamada = new ArrayList<>();
    }

    public ArrayList<Simbolo> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    public String verTabelaSimbolos() {
        String msg = "";
        for (Simbolo s : tabelaSimbolos) {
            if (s instanceof Variaveis) {
                msg += "Variável: " + s.identificador + ", tipo: " + ((Variaveis) s).getTipo() + "\n";
            } else if (s instanceof Funcion) {
                if (((Funcion) s).getTipoRetorno() == null)
                    msg += "Procedimento: " + s.identificador + "\n";
                else
                    msg += "Função: " + s.identificador + ", tipo de retorno: " + ((Funcion) s).getTipoRetorno()
                            + "\n";

                ArrayList<Variaveis> params = ((Funcion) s).getParametros();
                msg += "\tQuantidade de parâmetros: " + params.size() + "\n";
                if (params.size() != 0) {
                    msg += "\tParâmetros: ";
                    for (Variaveis v : params) {
                        msg += v.identificador + ": " + v.getTipo() + ", ";
                    }
                    msg = msg.substring(0, msg.length() - 2) + ".\n";
                }
            }
        }

        return msg;
    }
}
