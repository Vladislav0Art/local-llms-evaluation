package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest_setCodigoInterno {

    @Test
    public void test_setCodigoInterno() {
        final String codigoInterno = "ABC123";
        final Element element = new Element();
        element.setTextContent(codigoInterno);
        MDFInfoModalRodoviarioVeiculoReboque model = new MDFInfoModalRodoviarioVeiculoReboque();
        model.setCodigoInterno(codigoInterno);
    }

}