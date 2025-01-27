package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInternoTest1 {

    @Test
    public void setCodigoInternoTest1() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInternoExpected = "123456";
        obj.setCodigoInterno(codigoInternoExpected);
        assertEquals(codigoInternoExpected, obj.getCodigoInterno());
    }

}