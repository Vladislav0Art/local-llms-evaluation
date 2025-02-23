package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestSetRenavam {

    // Testing setCodigoInterno method

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        testObj.setRenavam("1234567890");
        assertEquals("1234567890", testObj.getRenavam());
    }

}