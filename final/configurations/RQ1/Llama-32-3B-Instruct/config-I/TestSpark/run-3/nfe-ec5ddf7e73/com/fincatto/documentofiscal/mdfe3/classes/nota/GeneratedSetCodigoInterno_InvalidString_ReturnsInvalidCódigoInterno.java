package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_InvalidString_ReturnsInvalidCódigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_InvalidString_ReturnsInvalidCódigoInterno() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCódigoInterno = "invalid";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(invalidCódigoInterno);
        assertEquals(DFStringValidador.INVALID, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}