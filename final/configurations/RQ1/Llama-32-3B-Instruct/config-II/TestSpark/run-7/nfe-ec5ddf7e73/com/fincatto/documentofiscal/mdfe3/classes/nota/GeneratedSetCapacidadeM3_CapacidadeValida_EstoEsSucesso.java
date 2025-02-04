package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_CapacidadeValida_EstoEsSucesso {

    @Test
    public void setCapacidadeM3_CapacidadeValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3("12");
        assertNotThrows(IllegalArgumentException.class);
    }

}