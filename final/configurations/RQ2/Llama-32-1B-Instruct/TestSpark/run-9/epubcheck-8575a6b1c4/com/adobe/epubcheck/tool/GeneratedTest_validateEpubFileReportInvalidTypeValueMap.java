package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportInvalidTypeValueMap {

    @Test
    public void test_validateEpubFileReportInvalidTypeValueMap() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, null);
        assertEquals(1, result); // 100% coverage
    }

}