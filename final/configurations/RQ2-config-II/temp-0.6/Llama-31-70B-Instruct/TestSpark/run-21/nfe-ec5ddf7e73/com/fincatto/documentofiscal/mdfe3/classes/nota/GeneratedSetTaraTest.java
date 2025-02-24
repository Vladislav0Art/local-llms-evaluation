package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTaraTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setTaraTest() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("1000");
        assertNotNull(reboque.getTara());
    }

}