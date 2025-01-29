package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGenerableToString {

    @Test
    public void testGenerableToString() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertEquals("test", generableToString(annotation));
    }

}