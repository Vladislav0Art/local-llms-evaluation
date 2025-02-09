package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_ValidFileWithWarningsReturnsCorrectValue {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void validateFile_ValidFileWithWarningsReturnsCorrectValue() throws Exception {
        File file = createTestFile();
        Map<String, String> warnings = new HashMap<>();
        eps.validateFile(file.toPath(), EPUBVersion.V3_0_2, new Report() {
        }, new EPUBProfile());
        assertEquals(1, warnings.size());
    }

}