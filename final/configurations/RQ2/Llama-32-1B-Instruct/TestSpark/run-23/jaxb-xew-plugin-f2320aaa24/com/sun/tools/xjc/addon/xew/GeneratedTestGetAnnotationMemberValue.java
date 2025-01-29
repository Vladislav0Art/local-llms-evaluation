package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberValue {

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annotation = getAnnotation(JElement.class);
        assertEquals(true, annotation != null);
        assertEquals("test", annotation.getMemberValue());
    }

}