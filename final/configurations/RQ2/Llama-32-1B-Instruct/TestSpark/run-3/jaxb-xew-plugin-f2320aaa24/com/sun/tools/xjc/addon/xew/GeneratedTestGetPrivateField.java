package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        String xmlDeclaration = "<xml-annotation xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:element name='test' type='xs:string'>" +
                "</xs:element>";

        JAnnotatable annotatable = getAnnotation(xmlDeclaration);

        // Check if the private field is present
        assertTrue(annotatable.hasPrivateField("test"));
    }

}