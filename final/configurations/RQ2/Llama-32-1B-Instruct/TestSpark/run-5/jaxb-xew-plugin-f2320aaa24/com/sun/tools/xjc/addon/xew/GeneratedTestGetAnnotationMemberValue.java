package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberValue {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        String propertyName = "propertyName";
        Object value = getAnnotationMemberValue(annotation, propertyName);
        assertEquals(propertyName, (String) value);
    }

}