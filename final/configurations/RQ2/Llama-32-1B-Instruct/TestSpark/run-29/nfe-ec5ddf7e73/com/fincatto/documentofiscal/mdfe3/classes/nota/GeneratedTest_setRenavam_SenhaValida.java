package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_setRenavam_SenhaValida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setRenavam_SenhaValida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getRenavam()).thenReturn("DEF");
        String renavam = "DEF";
        mockMdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, renavam);
    }

}