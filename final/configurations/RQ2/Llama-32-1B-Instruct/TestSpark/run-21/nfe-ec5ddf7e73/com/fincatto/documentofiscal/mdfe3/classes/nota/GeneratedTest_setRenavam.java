package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setRenavam {

    @Test
    public void test_setRenavam() {
        final String renavam = "DEF789";
        final Element element = new Element();
        element.setTextContent(renavam);
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setRenavam(renavam);
    }

}