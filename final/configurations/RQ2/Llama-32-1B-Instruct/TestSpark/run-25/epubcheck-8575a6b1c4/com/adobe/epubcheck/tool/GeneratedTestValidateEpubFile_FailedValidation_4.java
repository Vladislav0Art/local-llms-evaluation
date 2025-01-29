package com.adobe.epubcheck.tool;

public class GeneratedTestValidateEpubFile_FailedValidation_4 {

    public MockChecker mockChecker;
    public FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testValidateEpubFile_FailedValidation_4() {
        String path = "path/to/file.epub";
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