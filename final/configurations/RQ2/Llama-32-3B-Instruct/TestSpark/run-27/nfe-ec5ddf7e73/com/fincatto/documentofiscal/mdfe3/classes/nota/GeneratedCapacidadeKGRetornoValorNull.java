package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCapacidadeKGRetornoValorNull {

    @Test
    public void capacidadeKGRetornoValorNull() {
        final String capacidadeKG = "";
        DFStringValidador validador = new DFStringValidador();
        if (validador.isValidar(capacidadeKG).orElseBoolean()) {
            return;
        }
        // No valor válido, então o valor retorna null.
    }

}