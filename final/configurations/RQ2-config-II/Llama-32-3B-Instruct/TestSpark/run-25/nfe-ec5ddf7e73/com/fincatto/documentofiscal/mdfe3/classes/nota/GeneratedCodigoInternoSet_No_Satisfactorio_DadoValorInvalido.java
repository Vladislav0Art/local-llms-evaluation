package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCodigoInternoSet_No_Satisfactorio_DadoValorInvalido {

    @Test
    public void codigoInternoSet_No_Satisfactorio_DadoValorInvalido() {
        String codigoInterno = "codigo_invalido";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(codigoInterno);
        assertFalse(resultado);
    }

}