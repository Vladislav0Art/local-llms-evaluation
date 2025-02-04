package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_setsCapacidadeKGCorrectly {

    @Test
    public void setCapacidadeKG_setsCapacidadeKGCorrectly() {
        final String capacidadeKG = "12";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}