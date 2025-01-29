package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsListedAsParametrisation {

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable annotation = new JAnnotatable();
        isListedAsParametrisation(annotation, "test", "element");
        checkAnnotation(annotation);
    }

}