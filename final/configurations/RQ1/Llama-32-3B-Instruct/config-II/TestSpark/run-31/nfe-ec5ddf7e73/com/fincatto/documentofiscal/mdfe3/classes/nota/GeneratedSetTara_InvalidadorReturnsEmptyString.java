package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_InvalidadorReturnsEmptyString {

    @Test
    public void setTara_InvalidadorReturnsEmptyString() {
        String tara = "10x";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            obj.setTara(tara);
            fail("Expected DFStringValidador.capacidadeNDigitos to throw an exception");
        } catch (Exception e) {
            assertEquals("Tara em reboque", e.getMessage());
        }
    }

}