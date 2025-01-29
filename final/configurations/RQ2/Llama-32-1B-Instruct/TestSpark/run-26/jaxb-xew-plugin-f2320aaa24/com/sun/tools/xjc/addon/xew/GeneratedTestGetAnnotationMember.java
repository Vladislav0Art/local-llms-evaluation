package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMember {

    @Test
    public void testGetAnnotationMember() {
        JAnnotatable annotation = new JAnnotatable();
        getAnnotationMember(annotation, "test", "element", "member");
        checkAnnotation(annotation);
    }

}