package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_ValidFileNoErrorsReturnsZero {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void validateFile_ValidFileNoErrorsReturnsZero() throws Exception {
        File file = createTestFile();
        int result = eps.validateFile(file.toPath(), EPUBVersion.V3_0_2, new Report() {
        }, new EPUBProfile());
        assertEquals(0, result);
    }

    private File createTestFile() throws IOException {
        File file = File.createTempFile("test_file", ".epub");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("This is a test file.");
        }
        return file;
    }

}