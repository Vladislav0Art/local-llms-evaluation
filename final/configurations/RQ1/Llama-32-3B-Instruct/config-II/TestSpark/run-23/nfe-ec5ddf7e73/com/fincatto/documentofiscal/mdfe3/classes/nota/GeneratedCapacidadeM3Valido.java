package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCapacidadeM3Valido {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void capacidadeM3Valido() {
        String capacidadeM3 = "12";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertTrue(mdf.getCapacidadeM3().equals("12"));
    }

}