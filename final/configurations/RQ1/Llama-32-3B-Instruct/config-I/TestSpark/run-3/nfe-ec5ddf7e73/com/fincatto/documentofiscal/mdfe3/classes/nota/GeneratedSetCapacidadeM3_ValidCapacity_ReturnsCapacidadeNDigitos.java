package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_ValidCapacity_ReturnsCapacidadeNDigitos {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCapacidadeM3_ValidCapacity_ReturnsCapacidadeNDigitos() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String validCapacidadeM3 = "1";
        assertEquals("1", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}