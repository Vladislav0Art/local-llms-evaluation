package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSetCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testSetCapacidadeKG() {
        String capacidadeKG = "10.5";
        assertTrue(mockMdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG).isSuccess());
        assertEquals(1, mockMdfInfoModalRodoviarioVeiculoReboque.getSuccess().size());
    }

}