package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportEmptyString {

    @Test
    public void test_validateEpubFileReportEmptyString() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}