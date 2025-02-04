package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_PlacaValida_EstoEsSucesso {

    @Test
    public void setPlaca_PlacaValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

}