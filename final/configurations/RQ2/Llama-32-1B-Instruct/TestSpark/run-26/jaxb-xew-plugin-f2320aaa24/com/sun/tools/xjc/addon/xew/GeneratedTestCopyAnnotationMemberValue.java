package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyAnnotationMemberValue {

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annotation = new JAnnotatable();
        copyAnnotationMemberValue(annotation, "test", "element", "value");
        checkAnnotation(annotation);
    }

}