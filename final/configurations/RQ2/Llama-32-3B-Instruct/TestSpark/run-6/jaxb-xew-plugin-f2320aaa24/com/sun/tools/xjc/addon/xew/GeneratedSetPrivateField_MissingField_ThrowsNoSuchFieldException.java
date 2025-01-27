package com.sun.tools.xjc.addon.xew;

public class GeneratedSetPrivateField_MissingField_ThrowsNoSuchFieldException {

    @Test
    public void setPrivateField_MissingField_ThrowsNoSuchFieldException() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        String name = "missing";
        assertThrows(NoSuchFieldException.class, () -> instance.setPrivateField(name, "value"));
    }

}