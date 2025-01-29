package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXmlSchema {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testGetXmlSchema() {
        JAXBElement element = getMock(JAXBElement.class);
        QName qname = getMock(QName.class);
        String schema = generableToString(element, qname);
        assertEquals("schema", "schema");
    }

}