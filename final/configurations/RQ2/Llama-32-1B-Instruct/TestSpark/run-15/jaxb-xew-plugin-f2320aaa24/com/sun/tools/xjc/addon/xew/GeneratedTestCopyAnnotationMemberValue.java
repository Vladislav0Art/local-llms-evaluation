package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyAnnotationMemberValue {

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the annotation member value
        String name = getAnnotationMemberValue(element);

        assert !name.isEmpty();
    }

}