package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedGetCapacidadeKG_RetornaValueNotNull {

    @Test
    public void getCapacidadeKG_RetornaValueNotNull() {
        String capacidadeKG = "10.0";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

}