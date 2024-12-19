package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_getCapacidadeM3 {

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "30m";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(capacidadeM3).when(model, "tokenizer");
        String expected = "capacidade_m3";
        assertEquals(expected, model.getCapacidadeM3());
    }

}