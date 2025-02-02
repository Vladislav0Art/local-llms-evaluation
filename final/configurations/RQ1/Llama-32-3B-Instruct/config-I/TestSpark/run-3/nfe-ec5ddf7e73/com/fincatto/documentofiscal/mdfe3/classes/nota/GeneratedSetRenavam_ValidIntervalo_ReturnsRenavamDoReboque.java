package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_ValidIntervalo_ReturnsRenavamDoReboque {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setRenavam_ValidIntervalo_ReturnsRenavamDoReboque() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String validRenavam = "123456789";
        DFStringValidador.renavamDoReboque(validRenavam, 9, 11);
    }

}