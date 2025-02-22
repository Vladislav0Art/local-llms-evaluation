package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedDeveSetarCapacidadeM3Test {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void deveSetarCapacidadeM3Test() {
        reboque.setCapacidadeM3("12");
        assertEquals("12", reboque.getCapacidadeM3());
    }

}