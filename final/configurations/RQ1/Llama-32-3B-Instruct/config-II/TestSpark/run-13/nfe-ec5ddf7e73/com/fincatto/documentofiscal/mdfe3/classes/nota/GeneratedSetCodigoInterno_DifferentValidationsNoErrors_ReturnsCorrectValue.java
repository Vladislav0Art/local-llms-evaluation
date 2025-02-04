package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_DifferentValidationsNoErrors_ReturnsCorrectValue {

    @Test
    public void setCodigoInterno_DifferentValidationsNoErrors_ReturnsCorrectValue() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertEquals("123456789", obj.getCodigoInterno());
    }

}