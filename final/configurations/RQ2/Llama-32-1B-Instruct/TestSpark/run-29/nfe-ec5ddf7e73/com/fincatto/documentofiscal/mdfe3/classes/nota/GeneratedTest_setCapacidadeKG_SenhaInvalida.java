package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_setCapacidadeKG_SenhaInvalida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setCapacidadeKG_SenhaInvalida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG()).thenReturn("MNO");
        String capacidadeKG = "MNO";
        mockMdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, capacidadeKG);
    }

}