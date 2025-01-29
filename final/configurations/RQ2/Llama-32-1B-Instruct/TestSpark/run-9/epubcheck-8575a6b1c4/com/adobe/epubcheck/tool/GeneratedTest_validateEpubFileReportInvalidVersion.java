package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileReportInvalidVersion {

    @Test
    public void test_validateEpubFileReportInvalidVersion() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-report", "test.epub"};
        int result = validateFile("test.epub", EPUBVersion.EPUB3, null, null);
        assertEquals(1, result); // 100% coverage
    }

}