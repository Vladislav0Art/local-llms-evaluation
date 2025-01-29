package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXsdDeclaration {

    @Test
    public void testXsdDeclaration() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        XsdDeclaration xsdDeclaration = (XsdDeclaration) annotation.getDeclaringClass();
        assertNotNull(xsdDeclaration);
        assertEquals("test", xsdDeclaration.getSchemaId());
    }

}