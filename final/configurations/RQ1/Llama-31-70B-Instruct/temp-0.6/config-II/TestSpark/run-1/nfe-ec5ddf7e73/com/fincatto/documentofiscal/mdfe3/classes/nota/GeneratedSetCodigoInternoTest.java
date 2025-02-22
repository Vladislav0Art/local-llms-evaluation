package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456789";

        testClass.setCodigoInterno(codigoInterno);

        assertEquals("123456789", testClass.getCodigoInterno());
    }

}