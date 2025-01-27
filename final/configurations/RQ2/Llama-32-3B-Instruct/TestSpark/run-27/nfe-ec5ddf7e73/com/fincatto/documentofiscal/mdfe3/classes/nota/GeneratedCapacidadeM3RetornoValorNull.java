package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCapacidadeM3RetornoValorNull {

    @Test
    public void capacidadeM3RetornoValorNull() {
        final String capacidadeM3 = "";
        DFStringValidador validador = new DFStringValidador();
        if (validador.isValidar(capacidadeM3).orElseBoolean()) {
            return;
        }
        // No valor válido, então o valor retorna null.
    }

    public class DFStringValidador {

        private boolean valor;

        public boolean isValidar(String valor) {
            this.valor = !valor.isEmpty() && valor.matches("[A-Z][0-9]{4}-[A-Z]");
            return valor;
        }
    }

}