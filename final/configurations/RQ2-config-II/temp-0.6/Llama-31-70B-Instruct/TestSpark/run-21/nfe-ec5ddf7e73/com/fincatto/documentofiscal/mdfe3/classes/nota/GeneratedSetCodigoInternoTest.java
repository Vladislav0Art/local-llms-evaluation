package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInternoTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setCodigoInternoTest() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("0000000");
        assertNotNull(reboque.getCodigoInterno());
    }

}