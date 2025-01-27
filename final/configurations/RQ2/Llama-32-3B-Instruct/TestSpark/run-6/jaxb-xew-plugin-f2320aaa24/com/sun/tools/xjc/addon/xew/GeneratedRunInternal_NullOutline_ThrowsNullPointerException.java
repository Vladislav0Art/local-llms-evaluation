package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_NullOutline_ThrowsNullPointerException {

    @Test
    public void runInternal_NullOutline_ThrowsNullPointerException() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        assertTrue(instance.runInternal(null) instanceof NullPointerException);
    }

}