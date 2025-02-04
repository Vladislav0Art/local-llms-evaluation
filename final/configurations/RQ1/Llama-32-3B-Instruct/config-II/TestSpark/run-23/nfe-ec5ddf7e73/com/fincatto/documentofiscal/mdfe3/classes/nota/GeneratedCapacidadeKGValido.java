package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCapacidadeKGValido {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void capacidadeKGValido() {
        String capacidadeKG = "12.34";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertTrue(mdf.getCapacidadeKG().equals("12.34"));
    }

}