package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestSetCodigoInterno {

    // Testing setCodigoInterno method

    @Test
    public void testSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        testObj.setCodigoInterno("1234567890");
        assertEquals("1234567890", testObj.getCodigoInterno());
    }

}