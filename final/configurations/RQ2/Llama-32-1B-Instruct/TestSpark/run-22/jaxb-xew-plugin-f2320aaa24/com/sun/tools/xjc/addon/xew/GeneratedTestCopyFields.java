package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClass jclass1 = jclass1(XmlElementWrapper.class, List.class);
        JAnnotatable annot = XmlElementWrapper.class.getAnnotation("testAnnotation");
        List<String> fields = (List<String>) getAnnotationFieldValue(annot, "fields");
        assertEquals("fields", fields.toString());
    }

}