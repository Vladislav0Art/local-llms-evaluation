package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile {

    @Test
    public void testProcessEpubFile() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{"--output", "test.epub"}, null, null);
        assertEquals(0, result);
    }

}