package com.adobe.epubcheck.tool;

public class GeneratedTestValidateEpubFile_ValidationContextBuilderFailedToCreateWithInvalidScenario_6 {

    private MockChecker mockChecker;
    private FileResourceProvider resourceProvider;

    @Before
    public void setup() {
        mockChecker = new MockChecker();
        resourceProvider = new MockResourceProvider();
    }

    @Test
    public void testValidateEpubFile_ValidationContextBuilderFailedToCreateWithInvalidScenario_6() {
        String path = "path/to/file.epub";
        Report report = new DefaultReportImpl();
        EPUBProfile profile = null;
        ValidationContextBuilder builder = mockChecker.getValidationContextBuilder();

        try {
            builder.build(false);
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            // expected
        }
    }

}