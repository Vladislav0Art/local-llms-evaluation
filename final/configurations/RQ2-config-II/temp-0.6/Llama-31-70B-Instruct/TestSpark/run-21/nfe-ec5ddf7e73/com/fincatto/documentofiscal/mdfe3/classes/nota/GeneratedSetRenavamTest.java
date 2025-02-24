package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavamTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setRenavamTest() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("00000000000");
        assertNotNull(reboque.getRenavam());
    }

}