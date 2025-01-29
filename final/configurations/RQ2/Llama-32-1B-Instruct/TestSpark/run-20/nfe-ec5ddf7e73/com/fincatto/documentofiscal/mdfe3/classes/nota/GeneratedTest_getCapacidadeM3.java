package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_getCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_getCapacidadeM3() {
        String capacidadeM3 = "012345";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals("012345", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}