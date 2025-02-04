package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_CapacidadeInvalida_TraeExcecao {

    @Test
    public void setCapacidadeM3_CapacidadeInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setCapacidadeM3("ABC"));
    }

}