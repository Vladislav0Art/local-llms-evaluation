package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_ValidadorReturnsValidatedString {

    @Test
    public void setCapacidadeM3_ValidadorReturnsValidatedString() {
        String capacidadeM3 = "10";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals("10", obj.getCapacidadeM3());
    }

}