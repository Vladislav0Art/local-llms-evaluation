package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGenerableToString {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testGenerableToString() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        String propertyName = "propertyName";
        Object value = generableToString(annotation, propertyName);
        assertEquals(propertyName, (String) value);
    }

}