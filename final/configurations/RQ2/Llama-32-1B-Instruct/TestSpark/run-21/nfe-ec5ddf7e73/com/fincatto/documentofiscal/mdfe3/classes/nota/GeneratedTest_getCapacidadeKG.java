package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_getCapacidadeKG {

    @Test
    public void test_getCapacidadeKG() {
        final String capacidadeKG = "M3";
        final Element element = new Element();
        element.setTextContent(capacidadeKG);
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, model.getCapacidadeM3());
    }

}