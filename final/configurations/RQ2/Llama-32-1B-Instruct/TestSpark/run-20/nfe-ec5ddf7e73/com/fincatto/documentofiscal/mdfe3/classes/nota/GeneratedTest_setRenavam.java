package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setRenavam {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setRenavam() {
        String renavam = "DEF456";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals("DEF456", mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}