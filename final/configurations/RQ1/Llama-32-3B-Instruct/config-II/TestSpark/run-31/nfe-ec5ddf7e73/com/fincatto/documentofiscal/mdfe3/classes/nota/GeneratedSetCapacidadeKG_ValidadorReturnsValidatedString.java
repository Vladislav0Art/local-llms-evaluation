package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_ValidadorReturnsValidatedString {

    @Test
    public void setCapacidadeKG_ValidadorReturnsValidatedString() {
        String capacidadeKG = "20";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals("20", obj.getCapacidadeKG());
    }

}