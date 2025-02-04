package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_InvalidadorReturnsEmptyString {

    @Test
    public void setRenavam_InvalidadorReturnsEmptyString() {
        String renavam = "12345678901";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            obj.setRenavam(renavam);
            fail("Expected DFStringValidador.validaIntervalo to throw an exception");
        } catch (Exception e) {
            assertEquals("Renavam do reboque", e.getMessage());
        }
    }

}