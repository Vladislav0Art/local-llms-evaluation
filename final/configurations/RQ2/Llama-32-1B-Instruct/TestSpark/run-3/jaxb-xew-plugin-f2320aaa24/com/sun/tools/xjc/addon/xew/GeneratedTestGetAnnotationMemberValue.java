package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberValue {

    @Test
    public void testGetAnnotationMemberValue() {
        String xmlDeclaration = "<xml-annotation xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:element name='test' type='xs:string'>" +
                "</xs:element>";

        JAnnotatable annotatable = getAnnotation(xmlDeclaration);

        Object annotationMemberValue = annotatable.getAnnotationMemberValue("test");

        assertEquals("test", annotationMemberValue);
    }

}