package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileWithValidContent {

    @Test
    public void testValidateFileWithValidContent() {
        String file = "file2.epub";
        String expectedResult = "0";
        Report report = new Report();
        int result = EpubChecker.validateFile(file, "v1", report, null);
        assertEquals(expectedResult, Integer.toString(result));
    }

}