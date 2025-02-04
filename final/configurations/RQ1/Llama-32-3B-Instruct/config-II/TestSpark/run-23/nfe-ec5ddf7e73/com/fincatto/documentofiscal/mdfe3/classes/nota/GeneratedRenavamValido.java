package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedRenavamValido {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void renavamValido() {
        String renavam = "123456789";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertTrue(mdf.getRenavam().equals("123456789"));
    }

}