package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInternoTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInternoTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}