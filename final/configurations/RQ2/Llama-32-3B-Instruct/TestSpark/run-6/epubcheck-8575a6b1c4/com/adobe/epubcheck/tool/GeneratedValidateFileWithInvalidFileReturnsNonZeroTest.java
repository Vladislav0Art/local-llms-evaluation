package com.adobe.epubcheck.tool;

public class GeneratedValidateFileWithInvalidFileReturnsNonZeroTest {

    @Test
    public void validateFileWithInvalidFileReturnsNonZeroTest() {
        EpubChecker instance = new EpubChecker();
        File file = new File("nonExistentFile.epub");
        int result = instance.validateFile(file.getAbsolutePath(), EPUBVersion.V3_01, new Report(), new EPUBProfile());
        assertTrue(result != 0);
    }

}