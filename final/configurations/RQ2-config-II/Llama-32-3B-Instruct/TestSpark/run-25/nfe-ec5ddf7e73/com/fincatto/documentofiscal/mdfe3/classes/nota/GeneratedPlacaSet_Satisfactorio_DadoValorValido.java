package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPlacaSet_Satisfactorio_DadoValorValido {

    @Test
    public void placaSet_Satisfactorio_DadoValorValido() {
        String placa = "placa";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setPlaca(placa);
        assertEquals(placa, objeto.getPlaca());
    }

}