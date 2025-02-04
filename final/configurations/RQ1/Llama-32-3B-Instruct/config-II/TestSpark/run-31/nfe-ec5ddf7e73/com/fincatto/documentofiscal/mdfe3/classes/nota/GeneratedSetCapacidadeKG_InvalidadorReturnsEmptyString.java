package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_InvalidadorReturnsEmptyString {

    @Test
    public void setCapacidadeKG_InvalidadorReturnsEmptyString() {
        String capacidadeKG = "20x";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            obj.setCapacidadeKG(capacidadeKG);
            fail("Expected DFStringValidador.capacidadeNDigitos to throw an exception");
        } catch (Exception e) {
            assertEquals("Capacidade em KG reboque", e.getMessage());
        }
    }

}