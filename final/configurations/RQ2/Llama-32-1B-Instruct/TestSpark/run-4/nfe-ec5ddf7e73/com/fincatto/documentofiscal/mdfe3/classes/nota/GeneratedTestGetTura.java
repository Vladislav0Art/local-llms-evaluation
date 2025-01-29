package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetTura {

    @Test
    public void testGetTura() {
        Element turaElement = new Element("tura");
        assertEquals("Hola mundo", turaElement.getTextContent());
    }

}