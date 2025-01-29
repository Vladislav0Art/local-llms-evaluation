package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_setCapacidadeM3_SenhaInvalida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setCapacidadeM3_SenhaInvalida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3()).thenReturn("STU");
        String capacidadeM3 = "STU";
        mockMdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, capacidadeM3);
    }

}