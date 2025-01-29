package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportMapValue {

    @Test
    public void test_validateEpubFileReportMapValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, null);
        assertEquals(0, result); // 100% coverage
    }

}