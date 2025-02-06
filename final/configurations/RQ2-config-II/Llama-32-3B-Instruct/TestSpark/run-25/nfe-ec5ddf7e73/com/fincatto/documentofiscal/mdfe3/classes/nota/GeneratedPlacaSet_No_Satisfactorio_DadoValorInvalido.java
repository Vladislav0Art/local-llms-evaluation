package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPlacaSet_No_Satisfactorio_DadoValorInvalido {

    @Test
    public void placaSet_No_Satisfactorio_DadoValorInvalido() {
        String placa = "placa_invalida";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(placa);
        assertFalse(resultado);
    }

}