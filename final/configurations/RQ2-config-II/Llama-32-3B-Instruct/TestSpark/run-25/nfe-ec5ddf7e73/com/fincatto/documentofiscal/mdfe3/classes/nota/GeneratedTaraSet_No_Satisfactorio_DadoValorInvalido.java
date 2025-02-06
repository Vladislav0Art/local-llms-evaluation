package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTaraSet_No_Satisfactorio_DadoValorInvalido {

    @Test
    public void taraSet_No_Satisfactorio_DadoValorInvalido() {
        String tara = "tara_invalida";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(tara);
        assertFalse(resultado);
    }

}