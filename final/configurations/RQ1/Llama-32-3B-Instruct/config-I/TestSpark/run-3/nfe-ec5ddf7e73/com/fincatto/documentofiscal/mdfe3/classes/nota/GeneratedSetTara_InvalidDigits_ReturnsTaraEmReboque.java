package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_InvalidDigits_ReturnsTaraEmReboque {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setTara_InvalidDigits_ReturnsTaraEmReboque() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidTara = "invalid";
        assertEquals("invalid", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}