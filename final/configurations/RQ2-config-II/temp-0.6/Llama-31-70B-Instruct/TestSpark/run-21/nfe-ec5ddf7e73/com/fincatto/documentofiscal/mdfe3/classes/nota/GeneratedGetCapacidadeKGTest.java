package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedGetCapacidadeKGTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void getCapacidadeKGTest() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("1000");
        assertNotNull(reboque.getCapacidadeKG());
    }

}