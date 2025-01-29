package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testGetAnnotation() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        assertEquals(XML_ELEMENT_NAME, getAnnotation(annotation).getName());
    }

}