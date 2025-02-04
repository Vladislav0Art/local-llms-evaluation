package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_CodigoValido_EstoEsSucesso {

    @Test
    public void setCodigoInterno_CodigoValido_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

}