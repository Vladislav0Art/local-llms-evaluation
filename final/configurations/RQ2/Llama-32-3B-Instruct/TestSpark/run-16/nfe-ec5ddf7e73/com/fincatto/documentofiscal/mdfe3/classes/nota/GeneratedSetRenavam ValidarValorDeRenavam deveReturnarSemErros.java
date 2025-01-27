package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavam ValidarValorDeRenavam deveReturnarSemErros {

    @Test
    public void setRenavam

    ValidarValorDeRenavam deveReturnarSemErros() {
        String renavam = "12.345.678-0";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(renavam);
        assertEquals(true, resultado);
    }

}