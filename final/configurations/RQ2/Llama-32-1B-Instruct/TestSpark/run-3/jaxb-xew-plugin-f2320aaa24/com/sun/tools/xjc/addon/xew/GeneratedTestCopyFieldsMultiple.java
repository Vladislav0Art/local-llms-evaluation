package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFieldsMultiple {

    @Test
    public void testCopyFieldsMultiple() {
        String xmlDeclaration = "<xml-annotation xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:element name='test' type='xs:string'>" +
                "</xs:element>" +
                "<xs:element name='another-test' type='xs:string'>" +
                "</xs:element>";

        JAnnotatable annotatable = getAnnotation(xmlDeclaration);

        // Copy fields from one element to another
        assertEquals(2, copyFields(xmlDeclaration));
    }

}