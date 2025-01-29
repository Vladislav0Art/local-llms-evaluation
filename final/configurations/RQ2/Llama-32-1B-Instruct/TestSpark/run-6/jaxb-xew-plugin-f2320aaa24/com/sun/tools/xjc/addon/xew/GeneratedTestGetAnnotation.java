package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annotatable = CommonUtils.getAnnotation(XmlElementWrapper.class);
        assertNotNull(annotatable);
    }

}