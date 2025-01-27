package com.adobe.epubcheck.tool;

public class GeneratedValidateFileWithValidFileAndProfileReturnsZeroTest {

    @Test
    public void validateFileWithValidFileAndProfileReturnsZeroTest() {
        EpubChecker instance = new EpubChecker();
        File file = new File("test.epub");
        int result = instance.validateFile(file.getAbsolutePath(), EPUBVersion.V3_01, new Report(), new EPUBProfile());
        assertEquals(0, result);
    }

}