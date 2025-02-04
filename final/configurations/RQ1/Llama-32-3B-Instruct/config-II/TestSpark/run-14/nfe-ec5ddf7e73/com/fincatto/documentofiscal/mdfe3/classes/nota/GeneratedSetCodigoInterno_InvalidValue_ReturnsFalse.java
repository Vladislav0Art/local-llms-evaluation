package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_InvalidValue_ReturnsFalse {

    @Test
    public void setCodigoInterno_InvalidValue_ReturnsFalse() {
        String codigoInterno = "1234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setCodigoInterno(codigoInterno);
        assertTrue(!resultado);
    }

}