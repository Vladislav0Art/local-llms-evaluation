package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_ValidFile_0 {

    public MockChecker mockChecker;
    public FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testProcessEpubFile_ValidFile_0() {
        String[] args = {"path/to/file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(0, result);
    }

}