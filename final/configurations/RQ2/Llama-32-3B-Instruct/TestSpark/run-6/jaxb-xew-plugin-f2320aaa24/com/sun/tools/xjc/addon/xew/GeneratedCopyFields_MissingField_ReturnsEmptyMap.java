package com.sun.tools.xjc.addon.xew;

public class GeneratedCopyFields_MissingField_ReturnsEmptyMap {

    @Test
    public void copyFields_MissingField_ReturnsEmptyMap() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        Map<String, String> map = instance.copyFields(null);
        assertTrue(map.isEmpty());
    }

}