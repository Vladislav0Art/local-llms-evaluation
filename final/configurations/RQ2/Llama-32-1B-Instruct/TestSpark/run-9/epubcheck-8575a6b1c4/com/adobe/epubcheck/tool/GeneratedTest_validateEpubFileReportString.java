package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportString {

    @Test
    public void test_validateEpubFileReportString() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}