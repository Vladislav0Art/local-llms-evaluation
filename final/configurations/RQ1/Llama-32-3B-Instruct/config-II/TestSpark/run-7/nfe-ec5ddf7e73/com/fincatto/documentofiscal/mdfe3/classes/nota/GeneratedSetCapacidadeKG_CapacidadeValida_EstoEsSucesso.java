package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_CapacidadeValida_EstoEsSucesso {

    @Test
    public void setCapacidadeKG_CapacidadeValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

}