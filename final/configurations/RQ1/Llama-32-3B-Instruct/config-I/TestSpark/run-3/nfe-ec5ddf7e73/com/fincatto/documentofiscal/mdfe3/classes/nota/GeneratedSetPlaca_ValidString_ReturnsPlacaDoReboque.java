package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_ValidString_ReturnsPlacaDoReboque {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlaca_ValidString_ReturnsPlacaDoReboque() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String validPlaca = "123456";
        DFStringValidador.placaDeVeiculo(validPlaca, "Placa do reboque");
    }

}