package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setCapacidadeM3() {
        String capacidadeM3 = "67890";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals("67890", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}