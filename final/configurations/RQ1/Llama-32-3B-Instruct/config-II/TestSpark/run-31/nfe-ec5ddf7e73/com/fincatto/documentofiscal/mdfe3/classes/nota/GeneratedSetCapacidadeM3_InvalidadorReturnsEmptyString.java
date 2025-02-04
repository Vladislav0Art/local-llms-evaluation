package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_InvalidadorReturnsEmptyString {

    @Test
    public void setCapacidadeM3_InvalidadorReturnsEmptyString() {
        String capacidadeM3 = "10x";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            obj.setCapacidadeM3(capacidadeM3);
            fail("Expected DFStringValidador.capacidadeNDigitos to throw an exception");
        } catch (Exception e) {
            assertEquals("Capacidade em M3 reboque", e.getMessage());
        }
    }

}