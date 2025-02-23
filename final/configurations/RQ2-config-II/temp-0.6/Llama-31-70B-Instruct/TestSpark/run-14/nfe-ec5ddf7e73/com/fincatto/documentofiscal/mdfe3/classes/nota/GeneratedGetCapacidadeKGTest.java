package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedGetCapacidadeKGTest {

    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Before
    public void setUp() {
        veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void getCapacidadeKGTest() {
        veiculoReboque.setCapacidadeKG("12345");
        assertEquals("12345", veiculoReboque.getCapacidadeKG());
    }

}