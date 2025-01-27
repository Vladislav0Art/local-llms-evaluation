package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedTaraSetIsNotValidarios {

    @Test
    public void taraSetIsNotValidarios() {
        final String tara = "TAR-1234";
        DFStringValidador validador = new DFStringValidador();
        assertThat(validador.isValidar(tara), is(true));
    }

}