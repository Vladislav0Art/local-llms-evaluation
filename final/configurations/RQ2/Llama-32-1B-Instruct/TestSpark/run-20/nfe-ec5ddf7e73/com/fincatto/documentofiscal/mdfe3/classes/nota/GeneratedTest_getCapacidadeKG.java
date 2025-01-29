package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_getCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_getCapacidadeKG() {
        String capacidadeKG = "123456";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals("123456", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}