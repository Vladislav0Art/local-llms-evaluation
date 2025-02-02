package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCodigoInternoSetInvalidoTest {

    @Test
    public void codigoInternoSetInvalidoTest() {
        String codigoInterno = "abcdefghij";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals("1234567890", new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

}