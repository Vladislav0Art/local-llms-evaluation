package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetPlaca ValidarValorDePlaca deveReturnarSemErros {

    @Test
    public void setPlaca

    ValidarValorDePlaca deveReturnarSemErros() {
        String placa = "1234AB";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(placa);
        assertEquals(true, resultado);
    }

}