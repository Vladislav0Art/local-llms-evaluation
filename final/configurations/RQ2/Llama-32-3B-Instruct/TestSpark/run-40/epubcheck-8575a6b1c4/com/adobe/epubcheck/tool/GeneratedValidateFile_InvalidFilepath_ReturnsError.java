package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_InvalidFilepath_ReturnsError {

    @Test
    public void validateFile_InvalidFilepath_ReturnsError() {
        assertThrows(InvalidArgumentException.class, () -> EpubChecker.getInstance().validateFile("/invalid/file.epub", null));
    }

}