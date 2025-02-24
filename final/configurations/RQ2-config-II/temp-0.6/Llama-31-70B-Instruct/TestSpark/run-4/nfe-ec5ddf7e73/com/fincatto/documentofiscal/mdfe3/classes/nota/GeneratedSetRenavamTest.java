package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavamTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setRenavamTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("1234567890");
        Assert.assertEquals("1234567890", mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}