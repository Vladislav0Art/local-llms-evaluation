package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    // Testing setCodigoInterno method

    @Test
    public void testSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        testObj.setCodigoInterno("1234567890");
        assertEquals("1234567890", testObj.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        testObj.setPlaca("AAA-9999");
        assertEquals("AAA-9999", testObj.getPlaca());
    }

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        testObj.setRenavam("1234567890");
        assertEquals("1234567890", testObj.getRenavam());
    }

}