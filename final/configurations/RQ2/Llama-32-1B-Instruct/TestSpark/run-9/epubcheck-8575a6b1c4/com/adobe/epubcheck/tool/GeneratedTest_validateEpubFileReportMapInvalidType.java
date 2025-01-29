package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportMapInvalidType {

    @Test
    public void test_validateEpubFileReportMapInvalidType() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(1, result); // 100% coverage
    }

}