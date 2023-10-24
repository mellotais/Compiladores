<?php
require_once('lexico.php');


 class SintaticoDescendenteRecursivo {
    private $contador;
    private $tokens;

    public function __construct($tokens) {
        $this->contador = 0;
        $this->tokens = $tokens;
    }

    private function term($expectedType) {
        if ($this->contador < count($this->tokens) &&
            $this->tokens[$this->contador]->tipo === $expectedType) {
            echo $expectedType . '<br>';
            $this->contador++;
            return true;
        }
        return false;
    }

    public function parse() {
        return $this->PROGRAMA();
    }
        // <PROGRAMA> ::= programa id ap fp <BLOCO>;
        public function PROGRAMA() {
          return $this->term("programa") &&  
                 $this->term("id") && 
                 $this->term("ap") &&
                 $this->term("fp") &&  
                 $this->BLOCO();
        }
    
        // <FUNCAO> ::= <TIPO> id ap <PARAMETROS> fp <BLOCO> | î;
        public function FUNCAO() {
            $ant = $this->contador;
            if ($this->TIPO() && $this->term("id") && 
                $this->term("ap") &&
                $this->PARAMETROS() && 
                $this->term("fp") && 
                $this->BLOCO()) {
                    return true;
            }
            $this->contador = $ant;
            return true;
        }

        // <PARAMETROS> ::= <TIPO> id <MAIS_PARAMETROS> | î;
        public function PARAMETROS() {
            $ant = $this->contador;
            if ($this->TIPO() && $this->term("id") && 
                $this->MAIS_PARAMETROS()) {
                return true;
            }
            // chama função vazio
            $this->contador = $ant;
            return true; 
        }
    
        // <MAIS_PARAMETROS> ::= virg <TIPO> id <MAIS_PARAMETROS> | î;
        public function MAIS_PARAMETROS() {
            $ant = $this->contador;
            if ($this->term("virg") && 
                $this->TIPO() && $this->term("id") &&
                $this->MAIS_PARAMETROS()) {
                return true;
            }
            $this->contador = $ant;
            return true;
        }
    
        // <FOR>::= for ap int id <FOR1> <FOR2> fp <BLOCO>;
        public function FOR() {
            return $this->term("for") && $this->term("ap") && $this->term("int") &&
                   $this->term("id") && $this->FOR1() && $this->FOR2() &&
                   $this->term("fp") && $this->BLOCO();
        }
    
        // <FOR1>::= atri const pv id <M> const pv id incr | î;
        public function FOR1() {
            $ant = $this->contador;
            if ($this->term("atri") && $this->term("const") && $this->term("pv") &&
                $this->term("id") && $this->M() && $this->term("const") &&
                $this->term("pv") && $this->term("id") && $this->term("incr")) {
                return true;
            }
            $this->contador = $ant;
            return true; // empty case
        }
    
        // <FOR2>::= dp id | î;
        public function FOR2() {
            $ant = $this->contador;
            if ($this->term("dp") && $this->term("id")) {
                return true;
            }
            $this->contador = $ant;
            return true; // empty case
        }
    
        // <M>::= maiorq | menorq;
        public function M() {
            $ant = $this->contador;
            if ($this->term("maiorq")){
                return true;
            } 
            else{
                $this->contador = $ant;
                return $this->term("menorq");
            }
        }
    
        // <BLOCO> ::= ac <LISTA_COMANDOS> fc;
        public function BLOCO() {
            return $this->term("ac") && 
                   $this->LISTA_COMANDOS() && 
                   $this->term("fc");
        }
    
        // <ID_CONSTANTE> ::= id | const;
        public function ID_CONSTANTE() {
            $ant = $this->contador;
            if ($this->term("id"))
                return true;
            else{
                $this->contador = $ant;
                return $this->term("const");
            }
        }
    
        // <LISTA_COMANDOS> ::= <COMANDO> <LISTA_COMANDOS> | î;
        public function LISTA_COMANDOS() {
            $ant = $this->contador;
            if ($this->COMANDO() && $this->LISTA_COMANDOS()){
                return true;
            }
            $this->contador = $ant;
            return true; 
        }
    
        // <COMANDO> ::= <DO>| <PRINT> | <READ> | <RETORNO> | <DECLARACAO_VAR> | <IF> | <SWITCH> | <WHILE> | <FOR>| <AT>;
        public function COMANDO() {
            $ant = $this->contador;
            
            if ($this->DO() || $this->PRINT() || $this->READ() || $this->RETORNO() || $this->DECLARACAO_VAR() || $this->IF() || $this->SWITCH() || $this->WHILE() || $this->FOR() || $this->AT()) {
                return true;
            }
            
            $this->contador = $ant;
            return false; // Retorna false se nenhum comando for correspondido.
        }
        
        

        // <ATRIBUICAO> ::= atri <EXPR> | î;
        public function ATRIBUICAO() {
            $ant = $this->contador;
            if ($this->term("atri")&&$this->EXPR()) {
                return true;
            }
            $this->contador = $ant;
            return true; // empty case
        }

        // <AT>::= id atri <EXPR> pv;
        public function AT() {
            return $this->term("id") && $this->term("atri") &&
                $this->EXPR() && $this->term("pv");
        }

        // <DO>::= do <BLOCO><WHILE>;
        public function DO() {
            return $this->term("do") && $this->BLOCO() && $this->WHILE();
        }

        // <WHILE> ::= while ap <EXPR> fp <BLOCO>;
        public function WHILE() {
            return $this->term("while") && $this->term("ap") &&
                $this->EXPR() && $this->term("fp") && $this->BLOCO();
        }

        // <EXPR> ::= <ID_CONSTANTE> <EXPR1>;
        public function EXPR() {
            return $this->ID_CONSTANTE() && $this->EXPR1();
        }

        // <EXPR1>::= <OPERADORES_ARITMETICOS> <ID_CONSTANTE> | î;
        public function EXPR1() {
            $ant = $this->contador;
            if ($this->OPERADORES_ARITMETICOS() && $this->ID_CONSTANTE()) {
                return true;
            }
            $this->contador = $ant;
            return true;
        }

        // <OPERADORES_ARITMETICOS> ::= soma |mult |sub | div | mod | igual | maiorq | menorq | maiorigual | menorigual;
        public function OPERADORES_ARITMETICOS() {
            $ant = $this->contador;
        
            if ($this->term("soma") || $this->term("mult") || $this->term("sub") ||
                $this->term("div") || $this->term("mod") || $this->term("igual") ||
                $this->term("maiorq") || $this->term("menorq") || $this->term("maiorigual") ||
                $this->term("menorigual")) {
                return true;
            }
        
            $this->contador = $ant;
            return false; 
        }
        // <TIPO> ::= int | string | char;
        public function TIPO() {
            $ant = $this->contador;
        
            if ($this->term("int") || $this->term("string") || $this->term("char")) {
                return true;
            } else {
                $this->contador = $ant;
                return false; 
            }
        }
        

        // <PRINT> ::= print ap <PRINT1> fp pv;
        public function PRINT() {
            $ant = $this->contador;
            return $this->term("print") && $this->term("ap") &&
                $this->PRINT1() && $this->term("fp") && $this->term("pv");
            $this->contador = $ant;
        }

        // <PRINT1> ::= aspas <PRINT2> aspas | <ID_CONSTANTE>;
        public function PRINT1() {
            $ant = $this->contador;

            if ($this->term("aspas") && $this->PRINT2() && $this->term("aspas")) {
                return true;
            }
            $this->contador = $ant;
            return $this->ID_CONSTANTE();
        }


        // <PRINT2> ::= id <PRINT2> | const <PRINT2> | ε;
        public function PRINT2() {
            $ant = $this->contador;

            if ($this->term("id") || $this->term("const")) {
                return $this->PRINT2();
               }

    $this->contador = $ant;
    return true; // ε (vazio)
}

        
        // <READ> ::= read ap id fp pv;
        public function READ() {
            return $this->term("read") && $this->term("ap") &&
                $this->term("id") && $this->term("fp") && $this->term("pv");
        }

        // <RETORNO> ::= return ap <EXPR> fp pv;
        public function RETORNO() {
            return $this->term("return") && $this->term("ap") && $this->EXPR() && $this->term("fp") && $this->term("pv");
        }

        // <DECLARACAO_VAR> ::= <TIPO> id <ATRIBUICAO> pv;
        public function DECLARACAO_VAR() {
            return $this->TIPO() && $this->term("id") &&
                $this->ATRIBUICAO() && $this->term("pv");
        }

        // <IF> ::= if ap <EXPR> fp <BLOCO> <ELSE>;
        public function IF() {
            return $this->term("if") && $this->term("ap") && $this->EXPR() &&
                $this->term("fp") && $this->BLOCO() && $this->ELSE();
        }

        // <ELSE> ::= else <BLOCO> | î;
        public function ELSE() {
            $ant = $this->contador;
        
            if ($this->term("else") && $this->BLOCO()) {
                return true;
            }
        
            $this->contador = $ant;
            return true; // ε (vazio)
        }

        // <SWITCH> ::= switch ap <ID_CONSTANTE> fp ac <CASE> fc;
        public function SWITCH() {
            return $this->term("switch") && $this->term("ap") &&
                $this->ID_CONSTANTE() && $this->term("fp") &&
                $this->term("ac") && $this->CASE() && $this->term("fc");
        }

        // <CASE> ::= case ap <ID_CONSTANTE>fp dp <LISTA_COMANDOS> <BREAK> <CASE> | î;
        public function CASE() {
            $ant = $this->contador;
        
            if ($this->term("case") && $this->term("ap") &&
                $this->ID_CONSTANTE() && $this->term("fp") &&
                $this->term("dp") && $this->LISTA_COMANDOS() &&
                $this->BREAK() && $this->CASE()) {
                return true;
            }
        
            $this->contador = $ant;
            return true; // ε (vazio)
        }

        // <BREAK> ::= break pv | î;
        public function BREAK() {
            $ant = $this->contador;
        
            if ($this->term("break") && $this->term("pv")) {
                return true;
            }
        
            $this->contador = $ant;
            return true; // ε (vazio)
        }



        public function getContador() {
            return $this->contador;
        }

        
}

$lexico = new Lexico();
$lexico->analisar();

$lista_tokens = $lexico->getListaTokens();

$sintatico = new SintaticoDescendenteRecursivo($lista_tokens);

if ($sintatico->parse() && $sintatico->getContador() == count($lista_tokens)) {
    echo "Análise sintática bem-sucedida!\n";
} else {
    echo "Erro na análise sintática!\n";
}
?>



