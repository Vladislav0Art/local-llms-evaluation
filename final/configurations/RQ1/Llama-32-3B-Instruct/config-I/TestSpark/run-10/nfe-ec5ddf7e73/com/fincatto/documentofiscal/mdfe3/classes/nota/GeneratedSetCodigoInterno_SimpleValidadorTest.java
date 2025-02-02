package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetCodigoInterno_SimpleValidadorTest {

    @Test
    public void setCodigoInterno_SimpleValidadorTest() {
        final String codigoInterno = "1234567890";
        final String esperado = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals(esperado, new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

}