package com.adobe.epubcheck.tool;

public class GeneratedValidateFileUnknownFormatTest {

    private static final File tmpFile = File.createTempFile("epub-checker", ".tmp");

    @Test
    public void validateFileUnknownFormatTest() throws Exception {
        File input_file = tmpFile;
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(input_file.getAbsolutePath(), EPUBVersion.v20, new DefaultReportImpl(), "unknown-format");
        assertNotNull(result);
    }

}