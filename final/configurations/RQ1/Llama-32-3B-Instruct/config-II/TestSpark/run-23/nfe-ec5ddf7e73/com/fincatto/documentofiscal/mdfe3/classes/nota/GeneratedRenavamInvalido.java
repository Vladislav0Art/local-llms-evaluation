package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedRenavamInvalido {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void renavamInvalido() {
        String renavam = "AB";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setRenavam(renavam));
    }

}