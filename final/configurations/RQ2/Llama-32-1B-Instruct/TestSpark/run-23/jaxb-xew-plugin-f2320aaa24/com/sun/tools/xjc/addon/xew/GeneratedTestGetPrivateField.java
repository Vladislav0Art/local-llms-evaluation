package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        JAnnotatable annotation = getAnnotation(JElement.class).getDeclaringClass();
        assertEquals(true, annotation != null);
        setPrivateField(annotation, "myField", new Object());
        assertEquals("myField", ((JCElement) annotation.getFields().get(0)).getName());
    }

}