package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileWithValidFile {

    @Test
    public void testValidateFileWithValidFile() {
        String file = "file1.epub";
        String expectedResult = "0";
        Report report = new Report();
        int result = EpubChecker.validateFile(file, "v1", report, null);
        assertEquals(expectedResult, Integer.toString(result));
    }

}