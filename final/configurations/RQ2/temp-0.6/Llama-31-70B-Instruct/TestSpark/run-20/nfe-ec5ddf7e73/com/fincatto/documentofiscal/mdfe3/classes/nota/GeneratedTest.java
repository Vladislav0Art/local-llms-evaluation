package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void deveSetarCodigoInternoTest() {
        reboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", reboque.getCodigoInterno());
    }

    @Test
    public void deveSetarPlacaTest() {
        reboque.setPlaca("ABC1234");
        assertEquals("ABC1234", reboque.getPlaca());
    }

    @Test
    public void deveSetarRenavamTest() {
        reboque.setRenavam("12345678901");
        assertEquals("12345678901", reboque.getRenavam());
    }

    @Test
    public void deveSetarTaraTest() {
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

    @Test
    public void deveSetarCapacidadeKgTest() {
        reboque.setCapacidadeKG("12345");
        assertEquals("12345", reboque.getCapacidadeKG());
    }

    @Test
    public void deveSetarCapacidadeM3Test() {
        reboque.setCapacidadeM3("12");
        assertEquals("12", reboque.getCapacidadeM3());
    }

}