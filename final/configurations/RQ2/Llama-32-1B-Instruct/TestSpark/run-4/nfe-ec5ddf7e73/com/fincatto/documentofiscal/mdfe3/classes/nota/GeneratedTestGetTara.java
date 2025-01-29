package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetTara {

    @Test
    public void testGetTara() {
        Element taraElement = new Element("tara");
        assertEquals("DEFghi", taraElement.getTextContent());
    }

}