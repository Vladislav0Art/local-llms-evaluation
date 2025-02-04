package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_TaraValida_EstoEsSucesso {

    @Test
    public void setTara_TaraValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

}