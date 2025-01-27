package com.sun.tools.xjc.addon.xew;

public class GeneratedGetPrivateField_MissingField_ReturnsNull {

    @Test
    public void getPrivateField_MissingField_ReturnsNull() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        String name = "missing";
        assertNull(instance.getPrivateField(name));
    }

}