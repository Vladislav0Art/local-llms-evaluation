package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlacaTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setPlacaTest() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA0000");
        assertNotNull(reboque.getPlaca());
    }

}