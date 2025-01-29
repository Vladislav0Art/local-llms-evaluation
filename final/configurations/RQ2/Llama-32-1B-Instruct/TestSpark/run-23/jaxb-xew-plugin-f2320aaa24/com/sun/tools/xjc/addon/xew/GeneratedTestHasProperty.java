package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasProperty {

    @Test
    public void testHasProperty() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertTrue(hasPropertyNameCustomization(annotation));
    }

}