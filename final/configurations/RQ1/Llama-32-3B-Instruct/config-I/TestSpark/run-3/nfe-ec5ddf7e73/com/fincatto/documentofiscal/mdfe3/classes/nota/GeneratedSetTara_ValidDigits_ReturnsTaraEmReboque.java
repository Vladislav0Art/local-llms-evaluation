package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_ValidDigits_ReturnsTaraEmReboque {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setTara_ValidDigits_ReturnsTaraEmReboque() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String validTara = "123";
        assertEquals("123", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}