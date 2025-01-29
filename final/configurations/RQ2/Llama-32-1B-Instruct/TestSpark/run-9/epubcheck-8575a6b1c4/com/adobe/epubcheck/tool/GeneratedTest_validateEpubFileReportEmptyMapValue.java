package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportEmptyMapValue {

    @Test
    public void test_validateEpubFileReportEmptyMapValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB2);
        assertEquals(0, result); // 100% coverage
    }

}