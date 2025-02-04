package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_CapacidadeEmKGReboque_InvalidValue_ReturnsFalse {

    @Test
    public void setCapacidadeKG_CapacidadeEmKGReboque_InvalidValue_ReturnsFalse() {
        String capacidadeKG = "1234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setCapacidadeKG(capacidadeKG);
        assertTrue(!resultado);
    }

}