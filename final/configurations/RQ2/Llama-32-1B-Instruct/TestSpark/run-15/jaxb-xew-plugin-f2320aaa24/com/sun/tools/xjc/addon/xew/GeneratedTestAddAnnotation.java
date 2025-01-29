package com.sun.tools.xjc.addon.xew;

public class GeneratedTestAddAnnotation {

    @Test
    public void testAddAnnotation() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the annotation value
        String name = getAnnotationValue(element);

        assert !name.isEmpty();
    }

}