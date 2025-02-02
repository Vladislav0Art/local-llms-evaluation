package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_InvalidCapacity_ReturnsCapacidadeNDigitos {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCapacidadeKG_InvalidCapacity_ReturnsCapacidadeNDigitos() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCapacidadeKG = "invalid";
        assertEquals("invalid", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}