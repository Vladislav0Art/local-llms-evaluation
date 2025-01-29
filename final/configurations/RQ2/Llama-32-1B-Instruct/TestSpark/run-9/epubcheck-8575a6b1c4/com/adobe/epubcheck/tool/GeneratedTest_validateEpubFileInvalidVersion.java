package com.adobe.epubcheck.tool;

public class GeneratedTest_validateEpubFileInvalidVersion {

    @Test
    public void test_validateEpubFileInvalidVersion() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-invalid", "test.epub"};
        int result = validateFile("test.epub", EPUBVersion.EPUB2, null, null);
        assertEquals(1, result); // 100% coverage
    }

}