package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTara {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testTara() {
        String tara = "GHI789";
        assertTrue(mockMdfInfoModalRodoviarioVeiculoReboque.getTara().equals(tara));
        assertEquals(0, mockMdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}