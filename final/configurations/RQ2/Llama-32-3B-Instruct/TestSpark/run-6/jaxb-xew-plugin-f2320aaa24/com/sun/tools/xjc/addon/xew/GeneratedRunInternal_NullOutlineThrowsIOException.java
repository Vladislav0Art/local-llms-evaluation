package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_NullOutlineThrowsIOException {

    @Test
    public void runInternal_NullOutlineThrowsIOException() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        assertTrue(instance.runInternal(null) instanceof IOException);
    }

}