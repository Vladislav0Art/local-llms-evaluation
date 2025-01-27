package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCodigoInternoSetIsNotValidarios {

    @Test
    public void codigoInternoSetIsNotValidarios() {
        final String codigoInterno = "Código Interno";
        DFStringValidador validador = new DFStringValidador();
        assertThat(validador.isValidar(codigoInterno), is(false));
    }

}