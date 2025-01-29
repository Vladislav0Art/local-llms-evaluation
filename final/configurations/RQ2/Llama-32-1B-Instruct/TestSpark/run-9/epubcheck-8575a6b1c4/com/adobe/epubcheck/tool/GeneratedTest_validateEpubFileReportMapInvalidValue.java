package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportMapInvalidValue {

    @Test
    public void test_validateEpubFileReportMapInvalidValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, null);
        assertEquals(1, result); // 100% coverage
    }

}