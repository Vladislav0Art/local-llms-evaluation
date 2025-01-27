package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedPlacaSetIsNotValidarios {

    @Test
    public void placaSetIsNotValidarios() {
        final String placa = "PLA-1234";
        DFStringValidador validador = new DFStringValidador();
        assertThat(validador.isValidar(placa), is(true));
    }

}