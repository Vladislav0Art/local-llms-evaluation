package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_setCodigoInterno {

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "1234567890";
        DfStringValidador dfStringValidador = new DfStringValidador();
        assertEquals(codigoInterno, MDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}