package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setCodigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setCodigoInterno() {
        String codigoInterno = "ABCDEFG";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals("ABCDEFG", mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}