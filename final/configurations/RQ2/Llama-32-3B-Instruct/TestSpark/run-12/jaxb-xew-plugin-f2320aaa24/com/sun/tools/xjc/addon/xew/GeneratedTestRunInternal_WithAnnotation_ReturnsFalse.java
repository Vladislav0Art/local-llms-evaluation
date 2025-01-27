package com.sun.tools.xjc.addon.xew;

public class GeneratedTestRunInternal_WithAnnotation_ReturnsFalse {

    public static boolean runInternal(Outline outline) throws ClassNotFoundException, IOException {
        // implementation
        return false;
    }

    @Test
    public void testRunInternal_WithAnnotation_ReturnsFalse() throws ClassNotFoundException, IOException {
        assertFalse(runInternal(new Outline()));
    }

}