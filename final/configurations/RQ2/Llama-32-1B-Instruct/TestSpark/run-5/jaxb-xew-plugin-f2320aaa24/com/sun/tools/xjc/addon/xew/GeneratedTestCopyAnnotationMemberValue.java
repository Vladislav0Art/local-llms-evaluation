package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyAnnotationMemberValue {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        CopyAnnotationMemberValue copyAnnotationMemberValue = new CopyAnnotationMemberValue();
        copyAnnotationMemberValue.copy(annotation);
        Object value = getAnnotationMemberValue(annotation, "propertyName");
        assertEquals("propertyName", (String) value);
    }

}