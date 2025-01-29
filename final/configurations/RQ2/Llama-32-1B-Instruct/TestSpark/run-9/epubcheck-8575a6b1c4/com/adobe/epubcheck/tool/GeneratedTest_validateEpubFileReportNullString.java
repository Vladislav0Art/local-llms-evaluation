package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportNullString {

    @Test
    public void test_validateEpubFileReportNullString() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test epub"};
        int result = validateFile("test.epub", null, null, EPUBProfile.EPUB3);
        assertEquals(0, result); // 100% coverage
    }

}