package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_setPlaca_SenhaValida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setPlaca_SenhaValida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getPlaca()).thenReturn("ABC");
        String placa = "ABC";
        mockMdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, placa);
    }

}