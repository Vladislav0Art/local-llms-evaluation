package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_getCapacidadeKG {

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "10kg";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(capacidadeKG).when(model, "tokenizer");
        String expected = "capacidade_kg";
        assertEquals(expected, model.getCapacidadeKG());
    }

}