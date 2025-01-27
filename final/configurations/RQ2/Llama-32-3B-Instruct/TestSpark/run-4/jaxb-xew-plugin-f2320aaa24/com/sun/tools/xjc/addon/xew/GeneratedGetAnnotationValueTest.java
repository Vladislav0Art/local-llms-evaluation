package com.sun.tools.xjc.addon.xew;

public class GeneratedGetAnnotationValueTest {

    @Test
    public void getAnnotationValueTest() {
        // Test case: Get annotation value from plugin
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        JAnnotatable annotatable = plugin.getPrivateField(JAnnotatable.class, "annotatable");
        assertEquals(annotatable, annotatable);
    }

}