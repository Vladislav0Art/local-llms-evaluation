package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAndSetCodigoInterno {

    @Test
    public void testGetAndSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        modal.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, modal.getCodigoInterno());
    }

}