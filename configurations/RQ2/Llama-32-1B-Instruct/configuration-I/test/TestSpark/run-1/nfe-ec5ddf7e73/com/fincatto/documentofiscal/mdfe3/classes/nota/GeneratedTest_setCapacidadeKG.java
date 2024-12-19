package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_setCapacidadeKG {

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "20kg";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(capacidadeKG).when(model, "tokenizer");
        model.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, model.getCapacidadeKG());
    }

}