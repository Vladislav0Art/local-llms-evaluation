package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileInvalidVersion {

    @Test
    public void testValidateFileInvalidVersion() {
        // Arrange
        EpubChecker checker = new EpubChecker();
        String[] args = {"/path/to/checker", "/path/to/file.epub"};

        // Act
        int returnCode = checker.validateFile(args[0], "invalid-version", args[1]);

        // Assert
        assertEquals(1, returnCode);
    }

}