package com.sun.tools.xjc.addon.xew;

public class GeneratedTestRunInternalNoAnnotation_ReturnsTrue {

    public static boolean runInternal(Outline outline) throws ClassNotFoundException, IOException {
        // implementation
        return false;
    }

    @Test
    public void testRunInternalNoAnnotation_ReturnsTrue() {
        assertTrue(runInternal(null));
    }

}