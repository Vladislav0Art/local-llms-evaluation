package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_InvalidFileThrowsException {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void validateFile_InvalidFileThrowsException() {
        try {
            eps.validateFile(new File("non_existent_file"), EPUBVersion.V3_0_2, new Report(), new EPUBProfile());
            fail("Expected exception not thrown");
        } catch (FileNotFoundException e) {
            assertEquals(Messages.FILE_NOT_FOUND, e.getMessage());
        }
    }

}