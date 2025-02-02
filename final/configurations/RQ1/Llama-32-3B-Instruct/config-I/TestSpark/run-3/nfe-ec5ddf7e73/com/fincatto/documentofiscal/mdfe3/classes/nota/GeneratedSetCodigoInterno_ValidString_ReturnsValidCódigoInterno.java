package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_ValidString_ReturnsValidCódigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_ValidString_ReturnsValidCódigoInterno() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String validCódigoInterno = "1234567890";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(validCódigoInterno);
        assertEquals("1234567890", mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}