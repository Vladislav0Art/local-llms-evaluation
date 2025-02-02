package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCodigoInternoSetValidoTest {

    @Test
    public void codigoInternoSetValidoTest() {
        String codigoInterno = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals("1234567890", new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

}