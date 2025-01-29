package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setPlaca {

    @Test
    public void test_setPlaca() {
        final String placa = "XYZ456";
        final Element element = new Element();
        element.setTextContent(placa);
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setPlaca(placa);
    }

}