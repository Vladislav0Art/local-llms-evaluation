package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_InvalidIntervalo_ReturnsRenavamDoReboque {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setRenavam_InvalidIntervalo_ReturnsRenavamDoReboque() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidRenavam = "invalid";
        DFStringValidador.renavamDoReboque(invalidRenavam, 9, 11);
    }

}