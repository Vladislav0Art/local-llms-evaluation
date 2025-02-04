package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetCodigoInterno_Validador {

    @Test
    public void testSetCodigoInterno_Validador() {
        String codigoInterno = "1234567890";
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno);
        assertEquals("1234567890", new MDFInfoModalRodoviarioVeiculoReboque().getCodigoInterno());
    }

}