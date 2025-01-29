package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCodigoInterno {

    @Test
    public void testCodigoInterno() {
        String codigoInterno = "12345";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, notar.getCodigoInterno());
    }

}