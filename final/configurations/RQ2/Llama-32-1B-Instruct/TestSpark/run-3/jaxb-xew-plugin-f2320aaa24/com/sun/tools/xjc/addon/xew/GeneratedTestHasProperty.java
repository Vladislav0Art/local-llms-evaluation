package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasProperty {

    @Test
    public void testHasProperty() {
        String xmlDeclaration = "<xml-annotation xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:element name='test' type='xs:string'>" +
                "</xs:element>";

        JAnnotatable annotatable = getAnnotation(xmlDeclaration);

        // Check if the property is present
        assertTrue(annotatable.hasProperty("test"));
    }

}