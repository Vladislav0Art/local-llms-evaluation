package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile {

    @Test
    public void testProcessEpubFile() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{"file", "-validate"});
        assertEquals(0, result);

        checkFile(new File("test.epub"));
    }

}