package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInterno ValorInvalidoDeCodigoInterno deveReturnarSemErros {

    @Test
    public void setCodigoInterno

    ValorInvalidoDeCodigoInterno deveReturnarSemErros() {
        String codigoInterno = "abc";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(codigoInterno);
        assertEquals(true, resultado);
    }

}