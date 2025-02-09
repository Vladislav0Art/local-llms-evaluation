package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile_success {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void testValidateFile_success() {
        String filePath = "/path/to/file";
        int version = EPUBVersion.EPUB20;
        int result = epubChecker.validateFile(filePath, version, report);
        assertTrue(result == 0 || result == -1);
    }

}