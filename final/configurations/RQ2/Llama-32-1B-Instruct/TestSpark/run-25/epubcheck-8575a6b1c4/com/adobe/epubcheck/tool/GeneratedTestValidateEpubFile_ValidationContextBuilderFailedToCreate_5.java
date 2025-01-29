package com.adobe.epubcheck.tool;

public class GeneratedTestValidateEpubFile_ValidationContextBuilderFailedToCreate_5 {

    public MockChecker mockChecker;
    public FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testValidateEpubFile_ValidationContextBuilderFailedToCreate_5() {
        String path = "path/to/file.epub";
        Report report = new DefaultReportImpl();
        EPUBProfile profile = null;
        ValidationContextBuilder builder = mockChecker.getValidationContextBuilder();

        try {
            builder.build();
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            // expected
        }
    }

}