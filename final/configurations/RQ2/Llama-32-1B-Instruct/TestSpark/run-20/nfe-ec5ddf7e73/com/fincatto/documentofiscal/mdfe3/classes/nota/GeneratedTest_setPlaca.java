package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void test_setPlaca() {
        String placa = "ABC123";
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals("ABC123", mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}