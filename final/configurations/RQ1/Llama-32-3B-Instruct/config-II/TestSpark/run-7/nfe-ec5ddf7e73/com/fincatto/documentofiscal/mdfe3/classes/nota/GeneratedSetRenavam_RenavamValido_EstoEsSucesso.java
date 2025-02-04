package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_RenavamValido_EstoEsSucesso {

    @Test
    public void setRenavam_RenavamValido_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

}