package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedDeveSetarCapacidadeKgTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void deveSetarCapacidadeKgTest() {
        reboque.setCapacidadeKG("12345");
        assertEquals("12345", reboque.getCapacidadeKG());
    }

}