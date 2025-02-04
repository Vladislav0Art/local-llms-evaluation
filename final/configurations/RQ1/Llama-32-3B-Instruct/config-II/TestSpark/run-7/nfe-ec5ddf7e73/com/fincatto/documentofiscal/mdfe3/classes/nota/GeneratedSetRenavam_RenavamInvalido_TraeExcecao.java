package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetRenavam_RenavamInvalido_TraeExcecao {

    @Test
    public void setRenavam_RenavamInvalido_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setRenavam("ABC"));
    }

}