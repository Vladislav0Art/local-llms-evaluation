package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annotation = new JAnnotatable();
        getAnnotation(annotation, "test", "element");
        checkAnnotation(annotation);
    }

}