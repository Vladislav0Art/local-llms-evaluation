package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_InvalidFile_1 {

    public MockChecker mockChecker;
    public FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testProcessEpubFile_InvalidFile_1() {
        String[] args = {"path/to/invalid/file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(-1, result);
    }

}