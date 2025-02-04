package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCodigoInternoValido {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void codigoInternoValido() {
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno("1234567890");
        assertTrue(mdf.getCodigoInterno().equals("1234567890"));
    }

}