package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testGetAnnotation() {
        // Create an XML declaration
        String xmlDeclaration = "<xml-annotation></xml-annotation>";

        // Get the annotation
        JAnnotatable annotatable = addAnnotation(xmlDeclaration);

        // Check if the annotation is present
        ObjectUtils.assertSame(".annotation", annotatable.getAnnotation());
    }

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

    @Test
    public void testCopyFields() {
        String xmlDeclaration = "<xml-annotation xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:element name='test' type='xs:string'>" +
                "</xs:element>";

        JAnnotatable annotatable = getAnnotation(xmlDeclaration);

        // No fields to copy
        assertEquals(0, copyFields(xmlDeclaration));
    }

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

    @Test
    public void testCopyFieldsAsRef() {
        String xmlDeclaration = "<xml-annotation xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:schema xmlns:xs='http://www.w3.org/2001/XMLSchema'>" +
                "<xs:element name='test' type='xs:string'>" +
                "</xs:element>" +
                "<xs:element name='another-test' type='xs:string'>" +
                "</xs:element>";

        JAnnotatable annotatable = getAnnotation(xmlDeclaration);

        // Copy fields as reference
        assertEquals(2, copyFieldsAsRef(xmlDeclaration));
    }

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