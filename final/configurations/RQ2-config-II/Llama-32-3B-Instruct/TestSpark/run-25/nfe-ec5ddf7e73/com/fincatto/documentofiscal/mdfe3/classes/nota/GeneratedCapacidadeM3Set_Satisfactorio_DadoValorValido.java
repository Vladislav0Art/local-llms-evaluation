package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCapacidadeM3Set_Satisfactorio_DadoValorValido {

    @Test
    public void capacidadeM3Set_Satisfactorio_DadoValorValido() {
        String capacidadeM3 = "capacidade_m3";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, objeto.getCapacidadeM3());
    }

}