package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_getCapacidadeM3 {

    @Test
    public void test_getCapacidadeM3() {
        final String capacidadeM3 = "K4";
        final Element element = new Element();
        element.setTextContent(capacidadeM3);
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeM3, model.getCapacidadeKG());
    }

}