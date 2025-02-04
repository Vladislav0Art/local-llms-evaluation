package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_InvalidadorReturnsEmptyString {

    @Test
    public void setCodigoInterno_InvalidadorReturnsEmptyString() {
        String codigoInterno = "12345678901";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertEquals("", obj.getCodigoInterno());
    }

}