package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_ValidadorReturnsValidatedString {

    @Test
    public void setRenavam_ValidadorReturnsValidatedString() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertEquals("123456789", obj.getRenavam());
    }

}