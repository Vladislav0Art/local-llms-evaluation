package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedValido {

    private String valorFiscal;
    private String[] valoresPossibles;

    public DFStringValidador(String valorFiscal, String[] valoresPossibles) {
        this.valorFiscal = valorFiscal;
        this.valoresPossibles = valoresPossibles;
    }

    @Test
    public void valido() {
        boolean esValido = true; // implementar lógica de validación
        assert esValido : "Valor fiscal invalido";
    }

}