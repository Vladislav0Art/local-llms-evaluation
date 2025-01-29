package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetCodigoInterno {

    @Test
    public void testGetCodigoInterno() {
        Element codigoInternoElement = new Element("codigo-interno");
        assertEquals("ABC123", codigoInternoElement.getTextContent());
    }

}