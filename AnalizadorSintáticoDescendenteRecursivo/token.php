<?php
class Token {
    public $tipo;
    public $valor;
    public $linha;
    public $posInicial;
    public $posFinal;

    public function __construct($tipo, $valor, $linha, $posInicial, $posFinal) {
        $this->tipo = $tipo;
        $this->valor = $valor;
        $this->linha = $linha;
        $this->posInicial = $posInicial;
        $this->posFinal = $posFinal;
    }

    public function __toString() {
        return "<{$this->tipo},{$this->valor},{$this->linha},{$this->posInicial},{$this->posFinal}>";
    }
}


?>