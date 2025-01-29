package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXsdDeclaration {

    @Test
    public void testGetXsdDeclaration() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        XsdDeclaration xsdDeclaration = (XsdDeclaration) annotation.getDeclaringClass();
        assertNotNull(xsdDeclaration);
        assertEquals("test", xsdDeclaration.getSchemaId());
    }

}