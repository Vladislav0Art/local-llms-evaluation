package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavamTest {

    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Before
    public void setUp() {
        veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void setRenavamTest() {
        veiculoReboque.setRenavam("12345678901");
        assertEquals("12345678901", veiculoReboque.getRenavam());
    }

}