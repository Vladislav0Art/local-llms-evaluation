package com.adobe.epubcheck.tool;

public class GeneratedRunRunTest {

    private static final File tmpFile = File.createTempFile("epub-checker", ".tmp");

    @Test
    public void runRunTest() throws Exception {
        String[] args = {"--input-file", tmpFile.getAbsolutePath()};
        int result = EpubChecker.class.getMethod("run", String[].class).invoke(null, (Object) args);
        assertEquals(0, result);
        assertTrue(tmpFile.exists());
    }

}