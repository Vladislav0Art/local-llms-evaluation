package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetTara_TaraInvalida_TraeExcecao {

    @Test
    public void setTara_TaraInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setTara("ABC"));
    }

}