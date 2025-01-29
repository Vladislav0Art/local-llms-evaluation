package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportMapNullValue {

    @Test
    public void test_validateEpubFileReportMapNullValue() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, new Report(), EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}