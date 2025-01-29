package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_KnownVersionAndUnknownProfile_3 {

    public MockChecker mockChecker;
    public FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testProcessEpubFile_KnownVersionAndUnknownProfile_3() {
        String[] args = {"path/to/file.epub"};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertEquals(1, result);
    }

}