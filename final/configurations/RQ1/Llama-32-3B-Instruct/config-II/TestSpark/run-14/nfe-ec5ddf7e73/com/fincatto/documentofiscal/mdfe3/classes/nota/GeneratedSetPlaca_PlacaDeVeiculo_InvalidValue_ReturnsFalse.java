package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_PlacaDeVeiculo_InvalidValue_ReturnsFalse {

    @Test
    public void setPlaca_PlacaDeVeiculo_InvalidValue_ReturnsFalse() {
        String placa = "1234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setPlaca(placa);
        assertFalse(resultado);
    }

}