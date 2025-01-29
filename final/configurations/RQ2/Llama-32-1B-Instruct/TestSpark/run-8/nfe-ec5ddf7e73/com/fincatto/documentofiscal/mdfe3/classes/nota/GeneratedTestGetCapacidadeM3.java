package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "20.5";
        assertTrue(mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3().equals(capacidadeM3));
        assertEquals(0, mockMdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}