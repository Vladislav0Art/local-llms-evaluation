package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyAnnotationMemberValue {

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annot = XmlElementWrapper.class.getAnnotation("testAnnotation");
        String value = (String) getAnnotationMemberValue(annot, "value");
        assertEquals("test-value", value);
    }

}