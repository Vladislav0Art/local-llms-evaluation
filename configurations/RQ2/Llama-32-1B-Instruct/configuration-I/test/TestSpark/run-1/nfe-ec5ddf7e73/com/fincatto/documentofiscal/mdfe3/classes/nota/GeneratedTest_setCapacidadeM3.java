package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class GeneratedTest_setCapacidadeM3 {

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "40m";
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        when(getTokenizer()).thenReturn(mock(StringTokenizer.class));
        doReturn(capacidadeM3).when(model, "tokenizer");
        model.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, model.getCapacidadeM3());
    }

}