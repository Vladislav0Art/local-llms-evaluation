package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_setPlaca {

    @Test
    public void test_setPlaca() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(placa).when(model, "tokenizer");
        String expected = "placa";
        assertEquals(expected, model.getPlaca());
    }

}