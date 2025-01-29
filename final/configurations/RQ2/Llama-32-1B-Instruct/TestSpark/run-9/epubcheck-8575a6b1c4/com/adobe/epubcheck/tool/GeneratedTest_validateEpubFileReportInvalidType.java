package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportInvalidType {

    @Test
    public void test_validateEpubFileReportInvalidType() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(1, result); // 100% coverage
    }

}