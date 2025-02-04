package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_ValidadorReturnsValidatedString {

    @Test
    public void setCodigoInterno_ValidadorReturnsValidatedString() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertEquals("1234567890", obj.getCodigoInterno());
    }

}