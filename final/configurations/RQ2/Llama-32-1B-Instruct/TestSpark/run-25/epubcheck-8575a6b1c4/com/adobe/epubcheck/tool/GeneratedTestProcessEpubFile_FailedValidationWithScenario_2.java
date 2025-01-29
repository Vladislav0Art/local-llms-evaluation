package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_FailedValidationWithScenario_2 {

    private MockChecker mockChecker;
    private FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testProcessEpubFile_FailedValidationWithScenario_2() {
        String[] args = {"path/to/file.epub", "V3", "EPUB2006"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertEquals(1, result);
    }

}