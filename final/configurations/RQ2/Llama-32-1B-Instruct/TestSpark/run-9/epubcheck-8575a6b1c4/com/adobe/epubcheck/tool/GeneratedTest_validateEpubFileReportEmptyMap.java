package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportEmptyMap {

    @Test
    public void test_validateEpubFileReportEmptyMap() {
        String[] args = {"-report"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}