package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_ValidadorReturnsValidatedString {

    @Test
    public void setTara_ValidadorReturnsValidatedString() {
        String tara = "10";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertEquals("10", obj.getTara());
    }

}