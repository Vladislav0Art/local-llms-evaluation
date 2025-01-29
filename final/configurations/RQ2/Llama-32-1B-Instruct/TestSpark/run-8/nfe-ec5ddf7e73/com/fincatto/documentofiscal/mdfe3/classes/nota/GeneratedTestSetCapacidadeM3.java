package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSetCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque mockMdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testSetCapacidadeM3() {
        String capacidadeM3 = "20.5";
        assertTrue(mockMdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3).isSuccess());
        assertEquals(1, mockMdfInfoModalRodoviarioVeiculoReboque.getSuccess().size());
    }

    private MDFInfoModalRodoviarioVeiculoReboque createMock() {
        return new MDFInfoModalRodoviarioVeiculoReboque();
    }

}