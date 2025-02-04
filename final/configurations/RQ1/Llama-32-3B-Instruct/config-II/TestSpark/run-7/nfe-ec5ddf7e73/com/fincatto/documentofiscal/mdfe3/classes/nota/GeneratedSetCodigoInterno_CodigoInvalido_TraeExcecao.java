package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_CodigoInvalido_TraeExcecao {

    @Test
    public void setCodigoInterno_CodigoInvalido_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setCodigoInterno("ABC"));
    }

}