package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_ValidadorReturnsValidatedString {

    @Test
    public void setPlaca_ValidadorReturnsValidatedString() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertEquals("ABC123", obj.getPlaca());
    }

}