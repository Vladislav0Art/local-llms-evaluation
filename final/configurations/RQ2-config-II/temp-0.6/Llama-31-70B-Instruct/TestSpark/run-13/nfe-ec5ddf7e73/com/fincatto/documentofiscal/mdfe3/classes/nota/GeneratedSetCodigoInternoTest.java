package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "Test";
        testObject.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, testObject.getCodigoInterno());
    }

}