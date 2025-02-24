package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInternoTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("1234567890");
        Assert.assertEquals("1234567890", mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("AAA1234");
        Assert.assertEquals("AAA1234", mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("1234567890");
        Assert.assertEquals("1234567890", mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void setTaraTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setTara("1234567890");
        Assert.assertEquals("1234567890", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}