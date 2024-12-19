package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_setCodigoInterno {

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "12345";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(codigoInterno).when(model, "tokenizer");
        String expected = "codigo_interno";
        assertEquals(expected, model.getCodigoInterno());
    }

}