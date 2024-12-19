package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_setRenavam {

    @Test
    public void test_setRenavam() {
        String renavam = "XYZ789";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(renavam).when(model, "tokenizer");
        String expected = "renavam";
        assertEquals(expected, model.getRenavam());
    }

}