package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetCodigoInterno {

    @Test
    public void testSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "CIO-123";
        modelo.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, modelo.getCodigoInterno());
    }

}