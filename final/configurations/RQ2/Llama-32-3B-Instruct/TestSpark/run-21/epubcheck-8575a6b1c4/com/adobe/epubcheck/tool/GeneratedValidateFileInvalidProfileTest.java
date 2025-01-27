package com.adobe.epubcheck.tool;

public class GeneratedValidateFileInvalidProfileTest {

    private static final File tmpFile = File.createTempFile("epub-checker", ".tmp");

    @Test
    public void validateFileInvalidProfileTest() throws Exception {
        File input_file = tmpFile;
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), "invalid-profile");
        assertNotNull(result);
    }

}