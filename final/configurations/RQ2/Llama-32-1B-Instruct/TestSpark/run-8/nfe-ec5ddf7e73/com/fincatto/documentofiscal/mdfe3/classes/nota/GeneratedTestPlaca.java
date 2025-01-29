package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testPlaca() {
        String placa = "ABC123";
        assertTrue(mockMdfInfoModalRodoviarioVeiculoReboque.getPlaca().equals(placa));
        assertEquals(0, mockMdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}