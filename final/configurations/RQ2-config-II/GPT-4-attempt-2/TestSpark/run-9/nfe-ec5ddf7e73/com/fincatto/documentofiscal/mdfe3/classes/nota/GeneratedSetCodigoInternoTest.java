package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        vehicle.setCodigoInterno("TestCode");
        assertEquals("TestCode", vehicle.getCodigoInterno());
    }

}