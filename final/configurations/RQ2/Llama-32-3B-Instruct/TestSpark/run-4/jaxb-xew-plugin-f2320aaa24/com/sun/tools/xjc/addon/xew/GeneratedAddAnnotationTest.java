package com.sun.tools.xjc.addon.xew;

public class GeneratedAddAnnotationTest {

    @Test
    public void addAnnotationTest() {
        // Test case: Add annotation to a value
        String value = "value";
        Annotation annotation = new Annotation("annotation");
        String result = CommonUtils.addAnnotation(value, annotation);
        assertNotNull(result);
    }

}