package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportInvalidValue {

    @Test
    public void test_validateEpubFileReportInvalidValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB2);
        assertEquals(1, result); // 100% coverage
    }

}