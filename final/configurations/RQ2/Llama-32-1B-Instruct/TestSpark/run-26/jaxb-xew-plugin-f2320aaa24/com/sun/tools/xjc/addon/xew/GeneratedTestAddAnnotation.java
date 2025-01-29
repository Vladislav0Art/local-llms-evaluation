package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddAnnotation {

    @Test
    public void testAddAnnotation() {
        JAnnotatable annotation = new JAnnotatable();
        addAnnotation(annotation, "test", "element");
        checkAnnotation(annotation);
    }

}