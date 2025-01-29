package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setTara {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setTara() {
        String tara = "GHI789";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals("GHI789", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}