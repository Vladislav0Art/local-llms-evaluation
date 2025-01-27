package com.sun.tools.xjc.addon.xew;

public class GeneratedTestRunInternal_NoOutliner_ThrowsIOException {

    public static boolean runInternal(Outline outline) throws ClassNotFoundException, IOException {
        // implementation
        return false;
    }

    @Test
    public void testRunInternal_NoOutliner_ThrowsIOException() throws ClassNotFoundException, IOException {
        try {
            runInternal(new Outline());
            fail("Expected IOException");
        } catch (IOException e) {
            // pass
        }
    }

}