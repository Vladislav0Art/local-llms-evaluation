package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annot = jclass.getAnnotation("testAnnotation");
        Object annotationValue = getAnnotationValue(annot);
        assertNotNull(annotationValue);
        assertEquals("test-annotation-value", annotationValue.toString());
    }

}