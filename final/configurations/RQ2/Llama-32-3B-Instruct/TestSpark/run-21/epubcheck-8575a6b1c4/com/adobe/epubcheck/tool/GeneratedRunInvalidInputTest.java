package com.adobe.epubcheck.tool;

public class GeneratedRunInvalidInputTest {

    private static final File tmpFile = File.createTempFile("epub-checker", ".tmp");

    @Test
    public void runInvalidInputTest() throws Exception {
        String[] args = {"--invalid-input"};
        try {
            int result = EpubChecker.class.getMethod("run", String[].class).invoke(null, (Object) args);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

}