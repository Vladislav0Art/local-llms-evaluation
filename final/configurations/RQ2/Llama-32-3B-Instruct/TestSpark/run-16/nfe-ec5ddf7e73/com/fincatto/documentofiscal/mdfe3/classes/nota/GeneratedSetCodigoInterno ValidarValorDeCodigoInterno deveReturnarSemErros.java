package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInterno ValidarValorDeCodigoInterno deveReturnarSemErros {

    @Test
    public void setCodigoInterno

    ValidarValorDeCodigoInterno deveReturnarSemErros() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(codigoInterno);
        assertEquals(true, resultado);
    }

}