package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);
    }

}