package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_SetPeso {

    @Test
    public void test_SetPeso() {
        String peso = "kg";
        DfMethodValidador dfMethodValidador = new DfMethodValidador();
        assertEquals(peso, MDFInfoModalRodoviarioVeiculoReboque getPeso());
    }

}