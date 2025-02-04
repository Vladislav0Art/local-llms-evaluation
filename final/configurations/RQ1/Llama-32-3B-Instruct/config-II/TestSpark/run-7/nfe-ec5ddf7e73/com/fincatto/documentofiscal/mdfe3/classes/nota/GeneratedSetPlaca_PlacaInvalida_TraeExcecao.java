package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_PlacaInvalida_TraeExcecao {

    @Test
    public void setPlaca_PlacaInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setPlaca("ABC"));
    }

}