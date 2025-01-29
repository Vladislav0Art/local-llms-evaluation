package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_setCodigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque object;

    @Before
    public void setUp() {
        object = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "ABC123";
        when(object.setCodigoInterno(null)).thenReturn(true);
        object.setCodigoInterno(codigoInterno);

        when(codigoInterno.trim()).thenReturn("trimmed_codigo_interno");
        assertEquals("trimmed_codigo_interno", object.getCodigoInterno());
    }

}