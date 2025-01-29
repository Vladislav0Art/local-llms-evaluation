package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportInvalidTypeMap {

    @Test
    public void test_validateEpubFileReportInvalidTypeMap() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB2);
        assertEquals(1, result); // 100% coverage
    }

}