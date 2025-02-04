package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_InvalidadorReturnsEmptyString {

    @Test
    public void setPlaca_InvalidadorReturnsEmptyString() {
        String placa = "ABC1234";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            obj.setPlaca(placa);
            fail("Expected DFStringValidador.placaDeVeiculo to throw an exception");
        } catch (Exception e) {
            assertEquals("Placa do reboque", e.getMessage());
        }
    }

}