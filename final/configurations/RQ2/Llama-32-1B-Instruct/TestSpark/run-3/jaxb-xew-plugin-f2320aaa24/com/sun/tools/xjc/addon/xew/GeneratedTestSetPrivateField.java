package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        String xmlDeclaration = "<xml-annotation xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:element name='test' type='xs:string'>" +
                "</xs:element>";

        JAnnotatable annotatable = getAnnotation(xmlDeclaration);

        // Set the private field
        setPrivateField("test", "value");

        // Check if the private field was updated
        assertEquals("value", getPrivateField("test"));
    }

}