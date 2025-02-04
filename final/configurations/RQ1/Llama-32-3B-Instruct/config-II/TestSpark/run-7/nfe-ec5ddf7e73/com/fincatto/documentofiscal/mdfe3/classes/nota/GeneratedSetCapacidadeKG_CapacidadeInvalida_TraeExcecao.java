package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeKG_CapacidadeInvalida_TraeExcecao {

    @Test
    public void setCapacidadeKG_CapacidadeInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setCapacidadeKG("ABC"));
    }

}