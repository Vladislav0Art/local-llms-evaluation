package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_setCodigoInterno_SenhaValida {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque = mock(MDFInfoModalRodoviarioVeiculoReboque.class);

    @Test
    public void test_setCodigoInterno_SenhaValida() {
        when(mockMdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno()).thenReturn("123");
        String codigoInterno = "123";
        mockMdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, codeiroInterno);
    }

}