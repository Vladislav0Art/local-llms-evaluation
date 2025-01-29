package com.adobe.epubcheck.tool;

public class GeneratedTest_validateFile {

    @Test
    public void test_validateFile() throws Exception {
        String[] args = {};
        int result = validateFile("test.epub", EPUBVersion.EPUB3, new Report(), null);
        assertEquals(0, result); // 100% coverage
    }

}