package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTaraValida {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void taraValida() {
        String tara = "12345";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(tara);
        assertTrue(mdf.getTara().equals("12345"));
    }

}