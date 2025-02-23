package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInternoTest {

    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Before
    public void setUp() {
        veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void setCodigoInternoTest() {
        veiculoReboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", veiculoReboque.getCodigoInterno());
    }

}