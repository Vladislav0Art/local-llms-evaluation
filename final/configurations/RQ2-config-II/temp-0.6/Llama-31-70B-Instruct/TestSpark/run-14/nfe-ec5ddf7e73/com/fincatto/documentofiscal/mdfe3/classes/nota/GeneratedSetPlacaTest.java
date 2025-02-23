package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlacaTest {

    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Before
    public void setUp() {
        veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void setPlacaTest() {
        veiculoReboque.setPlaca("ABC1234");
        assertEquals("ABC1234", veiculoReboque.getPlaca());
    }

}