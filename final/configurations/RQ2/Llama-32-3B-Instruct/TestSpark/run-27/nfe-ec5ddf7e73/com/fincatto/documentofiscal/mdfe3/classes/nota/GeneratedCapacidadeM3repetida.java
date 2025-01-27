package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCapacidadeM3repetida {

    @Test
    public void capacidadeM3repetida() {
        final String capacidadeM3 = "Capacidade M3 de Gold";
        final String capacidadeM3Repetida = "Capacidade M3 de Gold";
        DFStringValidador validador = new DFStringValidador();
        assertThat(validador.isValidar(capacidadeM3), is(false));
    }

}