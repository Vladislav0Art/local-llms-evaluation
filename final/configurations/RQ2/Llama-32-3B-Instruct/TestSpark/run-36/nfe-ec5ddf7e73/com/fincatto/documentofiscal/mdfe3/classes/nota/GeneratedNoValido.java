package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedNoValido {

    private String valorFiscal;
    private String[] valoresPossibles;

    public DFStringValidador(String valorFiscal, String[] valoresPossibles) {
        this.valorFiscal = valorFiscal;
        this.valoresPossibles = valoresPossibles;
    }

    @Test
    public void noValido() {
        boolean esValido = false; // implementar lógica de validación
        assert !esValido : "Valor fiscal valido";
    }
}

}