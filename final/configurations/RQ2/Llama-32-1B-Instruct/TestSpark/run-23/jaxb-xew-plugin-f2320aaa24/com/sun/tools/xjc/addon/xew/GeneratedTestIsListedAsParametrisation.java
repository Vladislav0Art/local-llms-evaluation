package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsListedAsParametrisation {

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertTrue(isListedAsParametrisation(annotation));
    }

}