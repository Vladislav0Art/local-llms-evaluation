package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCapacidadeKGLimitada {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void capacidadeKGLimitada() {
        String capacidadeKG = "12345678901234567890";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setCapacidadeKG(capacidadeKG));
    }

}