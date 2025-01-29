package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_getCapacidadeKG_SenhaValida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_getCapacidadeKG_SenhaValida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG()).thenReturn("JKL");
        String capacidadeKG = "JKL";
        assertEquals(capacidadeKG, capacidadeKG);
    }

}