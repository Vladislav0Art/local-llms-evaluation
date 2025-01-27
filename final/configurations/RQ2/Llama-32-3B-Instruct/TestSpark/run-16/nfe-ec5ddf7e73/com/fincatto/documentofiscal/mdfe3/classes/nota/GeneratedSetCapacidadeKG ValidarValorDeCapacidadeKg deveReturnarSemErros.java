package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeKG ValidarValorDeCapacidadeKg deveReturnarSemErros {

    @Test
    public void setCapacidadeKG

    ValidarValorDeCapacidadeKg deveReturnarSemErros() {
        String capacidadeKg = "1000kg";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(capacidadeKg);
        assertEquals(true, resultado);
    }

}