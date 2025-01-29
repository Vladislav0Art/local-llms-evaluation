package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "DEF789";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals("DEF789", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}