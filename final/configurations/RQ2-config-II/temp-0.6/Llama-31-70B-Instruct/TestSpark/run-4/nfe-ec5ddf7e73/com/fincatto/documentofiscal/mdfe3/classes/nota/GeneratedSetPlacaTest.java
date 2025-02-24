package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlacaTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlacaTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("AAA1234");
        Assert.assertEquals("AAA1234", mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}