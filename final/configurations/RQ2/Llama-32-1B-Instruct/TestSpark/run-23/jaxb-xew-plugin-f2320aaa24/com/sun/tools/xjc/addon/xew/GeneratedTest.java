package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
    }

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertEquals("test", annotation.getMemberValue());
    }

    @Test
    public void testCopyFields() {
        JClass jclass = copyFields(new JAnnotatable(), new ArrayList<>());
        assertEquals(1, jclass.getFields().size());
    }

    @Test
    public void testGenerableToString() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertEquals("test", generableToString(annotation));
    }

    @Test
    public void testHasPrivateField() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        assertTrue(jclass.hasPrivateField("myField"));
    }

    @Test
    public void testIsHiddenClass() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        assertEquals(true, isHiddenClass(jclass));
    }

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertTrue(isListedAsParametrisation(annotation));
    }

    @Test
    public void testSetPrivateField() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        setPrivateField(jclass, "myField", new Object());
    }

    @Test
    public void testXsdDeclaration() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        XsdDeclaration xsdDeclaration = (XsdDeclaration) annotation.getDeclaringClass();
        assertNotNull(xsdDeclaration);
        assertEquals("test", xsdDeclaration.getSchemaId());
    }

    @Test
    public void testHasProperty() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertTrue(hasPropertyNameCustomization(annotation));
    }

    @Test
    public void testGetJAXBElement() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        JAXBElement element = (JAXBElement) jclass.getFields().get(0);
        assertNotNull(element);
        assertEquals("test", element.getXMLSchema());
    }

    @Test
    public void testGetXsdDeclaration() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        XsdDeclaration xsdDeclaration = (XsdDeclaration) annotation.getDeclaringClass();
        assertNotNull(xsdDeclaration);
        assertEquals("test", xsdDeclaration.getSchemaId());
    }

    @Test
    public void testGetPrivateField() {
        JAnnotatable annotation = getAnnotation(JElement.class).getDeclaringClass();
        assertEquals(true, annotation != null);
        setPrivateField(annotation, "myField", new Object());
        assertEquals("myField", ((JCElement) annotation.getFields().get(0)).getName());
    }

}