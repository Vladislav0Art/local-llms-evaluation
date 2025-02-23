package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTaraTest {

    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Before
    public void setUp() {
        veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void setTaraTest() {
        veiculoReboque.setTara("12345");
        assertEquals("12345", veiculoReboque.getTara());
    }

}