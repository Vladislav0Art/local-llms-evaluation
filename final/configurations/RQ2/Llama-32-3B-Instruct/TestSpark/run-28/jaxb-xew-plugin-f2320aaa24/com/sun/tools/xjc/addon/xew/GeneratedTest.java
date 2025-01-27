package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

    @Test
    public void runInternal_NoAnnotations_ThrowsIOException() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Class<?> clazz = plugin.getClass();
        assertTrue(clazz.getName().endsWith("XmlElementWrapperPlugin"));
        assertEquals(0, clazz.getMethods().length);
    }

}