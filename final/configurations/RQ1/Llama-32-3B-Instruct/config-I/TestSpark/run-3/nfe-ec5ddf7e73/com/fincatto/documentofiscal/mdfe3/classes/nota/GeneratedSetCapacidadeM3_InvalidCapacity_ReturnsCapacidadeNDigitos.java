package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_InvalidCapacity_ReturnsCapacidadeNDigitos {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCapacidadeM3_InvalidCapacity_ReturnsCapacidadeNDigitos() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCapacidadeM3 = "invalid";
        assertEquals("invalid", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}