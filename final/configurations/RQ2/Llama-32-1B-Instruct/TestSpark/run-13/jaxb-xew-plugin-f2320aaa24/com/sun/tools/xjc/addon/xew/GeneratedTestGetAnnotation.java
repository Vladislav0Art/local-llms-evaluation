package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annotatable = getJAnnotatable();
        assertEquals(JavaName.valueOf("XmlElementWrapperPlugin"), annotatable.getAnnotationNames().get(0));
    }

}