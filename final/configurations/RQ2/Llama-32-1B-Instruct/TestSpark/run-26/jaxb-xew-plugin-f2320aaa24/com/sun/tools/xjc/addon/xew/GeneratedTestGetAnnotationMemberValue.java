package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberValue {

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annotation = new JAnnotatable();
        getAnnotationMemberValue(annotation, "test", "element", "value");
        checkAnnotation(annotation);
    }

}