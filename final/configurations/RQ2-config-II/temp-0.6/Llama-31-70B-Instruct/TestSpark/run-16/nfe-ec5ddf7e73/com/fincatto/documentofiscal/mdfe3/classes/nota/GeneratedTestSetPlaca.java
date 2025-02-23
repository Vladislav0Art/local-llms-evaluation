package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestSetPlaca {

    // Testing setCodigoInterno method

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque testObj = new MDFInfoModalRodoviarioVeiculoReboque();
        testObj.setPlaca("AAA-9999");
        assertEquals("AAA-9999", testObj.getPlaca());
    }

}