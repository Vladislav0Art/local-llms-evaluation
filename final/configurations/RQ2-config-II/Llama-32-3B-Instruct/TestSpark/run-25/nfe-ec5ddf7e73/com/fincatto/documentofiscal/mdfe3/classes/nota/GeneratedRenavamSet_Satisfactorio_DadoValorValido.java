package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRenavamSet_Satisfactorio_DadoValorValido {

    @Test
    public void renavamSet_Satisfactorio_DadoValorValido() {
        String renavam = "renavam";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setRenavam(renavam);
        assertEquals(renavam, objeto.getRenavam());
    }

}