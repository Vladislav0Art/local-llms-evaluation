package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileWithInvalidContent {

    @Test
    public void testValidateFileWithInvalidContent() {
        String file = "file3.epub";
        String expectedResult = "-1";
        Report report = new Report();
        int result = EpubChecker.validateFile(file, "v1", report, null);
        assertEquals(expectedResult, Integer.toString(result));
    }

}