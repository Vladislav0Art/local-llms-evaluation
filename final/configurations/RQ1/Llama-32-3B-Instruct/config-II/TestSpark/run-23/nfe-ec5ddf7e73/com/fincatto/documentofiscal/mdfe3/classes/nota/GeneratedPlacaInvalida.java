package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedPlacaInvalida {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void placaInvalida() {
        String placa = "AB";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdf.setPlaca(placa));
    }

}