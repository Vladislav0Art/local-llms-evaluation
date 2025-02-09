package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_ValidFile_ReturnsSuccess {

    @Test
    public void validateFile_ValidFile_ReturnsSuccess() throws Exception {
        File file = new File("valid_file.epub");
        EPUBVersion version = "3.0";

        int result = EpubChecker.getInstance().validateFile(file.getAbsolutePath(), version);
        assertTrue(result > 0);
    }

}