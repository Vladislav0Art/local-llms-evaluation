package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTara ValidarValorDeTara deveReturnarSemErros {

    @Test
    public void setTara

    ValidarValorDeTara deveReturnarSemErros() {
        String tara = "1000kg";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(tara);
        assertEquals(true, resultado);
    }

}