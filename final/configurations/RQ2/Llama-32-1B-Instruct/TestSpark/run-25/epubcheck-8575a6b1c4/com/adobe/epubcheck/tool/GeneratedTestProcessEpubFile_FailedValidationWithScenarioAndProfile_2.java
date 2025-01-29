package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_FailedValidationWithScenarioAndProfile_2 {

    private MockChecker mockChecker;
    private FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testProcessEpubFile_FailedValidationWithScenarioAndProfile_2() {
        String[] args = {"path/to/file.epub", "V3", "EPUB2006"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(args);
        assertEquals(1, result);
    }

}