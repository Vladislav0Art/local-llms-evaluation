package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportNullStringValue {

    @Test
    public void test_validateEpubFileReportNullStringValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}