package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_setTara_SenhaValida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setTara_SenhaValida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getTara()).thenReturn("GHI");
        String tara = "GHI";
        mockMdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, tara);
    }

}