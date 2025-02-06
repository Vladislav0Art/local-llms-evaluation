package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInterno_DadoValorValido_EstabeleceCodigoInternoCorretamente {

    @Test
    public void setCodigoInterno_DadoValorValido_EstabeleceCodigoInternoCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "00000001";
        modal.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, modal.getCodigoInterno());
    }

}