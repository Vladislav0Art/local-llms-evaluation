package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testCapacidadeKG() {
        String capacidadeKG = "10.5";
        assertTrue(mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG().equals(capacidadeKG));
        assertEquals(0, mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}