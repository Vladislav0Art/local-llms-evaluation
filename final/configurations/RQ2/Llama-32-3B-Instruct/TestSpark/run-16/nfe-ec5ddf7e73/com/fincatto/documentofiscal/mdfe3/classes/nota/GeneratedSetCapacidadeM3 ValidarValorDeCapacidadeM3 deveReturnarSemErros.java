package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeM3 ValidarValorDeCapacidadeM3 deveReturnarSemErros {

    @Test
    public void setCapacidadeM3

    ValidarValorDeCapacidadeM3 deveReturnarSemErros() {
        String capacidadeM3 = "1000m3";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(capacidadeM3);
        assertEquals(true, resultado);
    }

}