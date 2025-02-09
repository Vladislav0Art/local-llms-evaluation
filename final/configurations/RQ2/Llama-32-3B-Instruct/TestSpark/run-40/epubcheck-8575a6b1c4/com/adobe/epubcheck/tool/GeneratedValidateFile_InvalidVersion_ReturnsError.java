package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_InvalidVersion_ReturnsError {

    @Test
    public void validateFile_InvalidVersion_ReturnsError() {
        File file = new File("file.epub");
        EPUBVersion version = null;

        assertThrows(InvalidArgumentException.class, () -> EpubChecker.getInstance().validateFile(file.getAbsolutePath(), version));
    }

}