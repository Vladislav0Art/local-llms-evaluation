package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedCapacidadeM3Limitada {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void capacidadeM3Limitada() {
        String capacidadeM3 = "12345678901234567890";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setCapacidadeM3(capacidadeM3));
    }

}