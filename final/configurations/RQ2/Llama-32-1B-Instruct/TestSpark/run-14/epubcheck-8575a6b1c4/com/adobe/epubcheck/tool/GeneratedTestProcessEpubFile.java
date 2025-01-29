package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile {

    @Test
    public void testProcessEpubFile() throws Exception {
        String[] args = {"processEpubFile", "example.epub"};
        EpubChecker.processEpubFile(args);
    }

}