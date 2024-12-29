package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCodigoInternoSet_Sucesso_DadoCorreto {

    @Test
    public void codigoInternoSet_Sucesso_DadoCorreto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456";
        modal.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, modal.getCodigoInterno());
    }

}