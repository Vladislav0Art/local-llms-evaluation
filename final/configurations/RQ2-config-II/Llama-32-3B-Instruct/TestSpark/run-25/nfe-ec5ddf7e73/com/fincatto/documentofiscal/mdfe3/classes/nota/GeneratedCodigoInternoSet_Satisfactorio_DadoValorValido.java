package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCodigoInternoSet_Satisfactorio_DadoValorValido {

    @Test
    public void codigoInternoSet_Satisfactorio_DadoValorValido() {
        String codigoInterno = "codigo_interno";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, objeto.getCodigoInterno());
    }

}