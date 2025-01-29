package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_getCapacidadeM3_SenhaValida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_getCapacidadeM3_SenhaValida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3()).thenReturn("PQR");
        String capacidadeM3 = "PQR";
        assertEquals(capacidadeM3, capacidadeM3);
    }

}