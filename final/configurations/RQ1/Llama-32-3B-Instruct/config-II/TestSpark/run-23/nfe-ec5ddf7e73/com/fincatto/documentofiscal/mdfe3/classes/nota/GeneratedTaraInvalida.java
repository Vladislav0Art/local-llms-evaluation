package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTaraInvalida {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void taraInvalida() {
        String tara = "AB";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setTara(tara));
    }

}