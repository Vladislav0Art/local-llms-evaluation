package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedPlacaDeVeiculoValida {

    private MDFInfoModalRodoviarioVeiculoReboque mdf;

    @Test
    public void placaDeVeiculoValida() {
        String placa = "ABC123";
        mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(placa);
        assertTrue(MDFInfoModalRodoviarioVeiculoReboque.class.isInstance(mdf));
    }

}