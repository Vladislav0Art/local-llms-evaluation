package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportEmpty {

    @Test
    public void test_validateEpubFileReportEmpty() {
        String[] args = {"-report"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}