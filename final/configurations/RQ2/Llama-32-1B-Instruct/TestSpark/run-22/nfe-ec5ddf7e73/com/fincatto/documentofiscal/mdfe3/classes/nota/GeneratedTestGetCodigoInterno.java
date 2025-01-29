package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetCodigoInterno {

    @Test
    public void testGetCodigoInterno() {
        Element element = Element.builder("codigoInterno").value(" codigoInterno ").build();
        assertEquals("codigoInterno", element.getCodigoInterno());
    }

}