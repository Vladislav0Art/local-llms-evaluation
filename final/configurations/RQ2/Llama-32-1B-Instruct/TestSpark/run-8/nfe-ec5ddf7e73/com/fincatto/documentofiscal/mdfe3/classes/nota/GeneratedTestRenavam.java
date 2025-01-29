package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRenavam {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testRenavam() {
        String renavam = "DEF456";
        assertTrue(mockMdfInfoModalRodoviarioVeiculoReboque.getRenavam().equals(renavam));
        assertEquals(0, mockMdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}