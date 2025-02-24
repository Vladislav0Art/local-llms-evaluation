package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setPlaca("ABC1234");
        assertEquals("ABC1234", testObject.getPlaca());
    }

}