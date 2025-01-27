package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCapacidadeKGreterDoOuro {

    @Test
    public void capacidadeKGreterDoOuro() {
        final String capacidadeKG = "Capacidade KG de Gold > 10.000";
        DFStringValidador validador = new DFStringValidador();
        assertThat(validador.isValidar(capacidadeKG), is(false));
    }

}