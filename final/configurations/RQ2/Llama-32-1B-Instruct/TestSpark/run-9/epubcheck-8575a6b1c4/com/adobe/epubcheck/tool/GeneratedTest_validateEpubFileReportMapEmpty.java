package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportMapEmpty {

    @Test
    public void test_validateEpubFileReportMapEmpty() {
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}