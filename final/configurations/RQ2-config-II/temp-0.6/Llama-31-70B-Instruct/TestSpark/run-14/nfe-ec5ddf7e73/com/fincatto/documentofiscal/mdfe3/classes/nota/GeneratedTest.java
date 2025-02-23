package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

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

    @Test
    public void setPlacaTest() {
        veiculoReboque.setPlaca("ABC1234");
        assertEquals("ABC1234", veiculoReboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        veiculoReboque.setRenavam("12345678901");
        assertEquals("12345678901", veiculoReboque.getRenavam());
    }

    @Test
    public void setTaraTest() {
        veiculoReboque.setTara("12345");
        assertEquals("12345", veiculoReboque.getTara());
    }

    @Test
    public void getCapacidadeKGTest() {
        veiculoReboque.setCapacidadeKG("12345");
        assertEquals("12345", veiculoReboque.getCapacidadeKG());
    }

}