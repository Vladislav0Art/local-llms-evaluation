package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setCodigoInterno("1234");
        assertEquals("1234", testObject.getCodigoInterno());
    }

}