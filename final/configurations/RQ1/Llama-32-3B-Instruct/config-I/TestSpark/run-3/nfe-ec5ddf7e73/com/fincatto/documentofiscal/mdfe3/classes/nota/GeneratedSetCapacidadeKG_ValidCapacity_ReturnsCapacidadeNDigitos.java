package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_ValidCapacity_ReturnsCapacidadeNDigitos {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCapacidadeKG_ValidCapacity_ReturnsCapacidadeNDigitos() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String validCapacidadeKG = "123";
        assertEquals("123", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}