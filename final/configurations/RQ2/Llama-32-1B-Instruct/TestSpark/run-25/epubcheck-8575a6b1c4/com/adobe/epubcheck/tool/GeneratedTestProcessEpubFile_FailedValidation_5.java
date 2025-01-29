package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile_FailedValidation_5 {

    public MockChecker mockChecker;
    public FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testProcessEpubFile_FailedValidation_5() {
        String[] args = {"path/to/file.epub"};
        Report report = new DefaultReportImpl();
        EPUBVersion version = null;
        null;

        try {
            mockChecker.validateFile(path, version, report, profile);
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            // expected
        }
    }

}