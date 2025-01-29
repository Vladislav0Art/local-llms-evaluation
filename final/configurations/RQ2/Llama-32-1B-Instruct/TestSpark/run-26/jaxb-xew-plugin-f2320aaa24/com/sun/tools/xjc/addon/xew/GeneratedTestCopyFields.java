package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JAnnotatable annotation = new JAnnotatable();
        copyFields(annotation, "test", "element", "fields");
        checkAnnotation(annotation);
    }

}