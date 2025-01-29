package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setTara {

    @Test
    public void test_setTara() {
        final String tara = "GHI012";
        final Element element = new Element();
        element.setTextContent(tara);
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setTara(tara);
    }

}