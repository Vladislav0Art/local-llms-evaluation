package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedRenavamSet_No_Satisfactorio_DadoValorInvalido {

    @Test
    public void renavamSet_No_Satisfactorio_DadoValorInvalido() {
        String renavam = "renavam_invalida";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(renavam);
        assertFalse(resultado);
    }

}