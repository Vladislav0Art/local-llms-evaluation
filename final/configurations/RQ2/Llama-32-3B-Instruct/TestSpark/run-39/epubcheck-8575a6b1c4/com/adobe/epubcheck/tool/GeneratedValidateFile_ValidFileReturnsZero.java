package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_ValidFileReturnsZero {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void validateFile_ValidFileReturnsZero() throws Exception {
        File file = createTestFile();
        int result = eps.validateFile(file.toPath(), EPUBVersion.V3_0_2, new Report(), new EPUBProfile());
        assertEquals(0, result);
    }

}