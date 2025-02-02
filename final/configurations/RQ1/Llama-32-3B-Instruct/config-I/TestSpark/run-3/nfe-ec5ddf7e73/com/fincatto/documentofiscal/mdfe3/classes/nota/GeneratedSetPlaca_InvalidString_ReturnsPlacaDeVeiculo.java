package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_InvalidString_ReturnsPlacaDeVeiculo {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlaca_InvalidString_ReturnsPlacaDeVeiculo() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidPlaca = "invalid";
        DFStringValidador.placaDeVeiculo(invalidPlaca, "Placa do reboque");
    }

}