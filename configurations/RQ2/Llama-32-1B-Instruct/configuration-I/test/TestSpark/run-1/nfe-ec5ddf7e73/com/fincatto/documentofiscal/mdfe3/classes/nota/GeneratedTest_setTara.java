package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_setTara {

    @Test
    public void test_setTara() {
        String tara = "0123";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(tara).when(model, "tokenizer");
        String expected = "tara";
        assertEquals(expected, model.getTara());
    }

}