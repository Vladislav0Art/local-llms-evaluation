package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTaraTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setTaraTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setTara("1234567890");
        Assert.assertEquals("1234567890", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}