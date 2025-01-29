package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGenerableToString {

    @Test
    public void testGenerableToString() {
        JAnnotatable annotation = new JAnnotatable();
        generableToString(annotation, "test", "element");
        checkAnnotation(annotation);
    }

}