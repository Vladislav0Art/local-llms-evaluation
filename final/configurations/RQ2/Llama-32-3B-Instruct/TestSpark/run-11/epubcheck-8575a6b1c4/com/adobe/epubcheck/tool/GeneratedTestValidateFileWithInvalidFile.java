package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileWithInvalidFile {

    @Test
    public void testValidateFileWithInvalidFile() {
        String file = "invalid_file.epub";
        String expectedResult = "0";
        Report report = new Report();
        int result = EpubChecker.validateFile(file, "v1", report, null);
        assertEquals(expectedResult, Integer.toString(result));
    }

}