package com.adobe.epubcheck.tool;

public class GeneratedTestProcessEpubFile {

    @Test
    public void testProcessEpubFile() {
        // Arrange
        EpubChecker checker = new EpubChecker();
        String[] args = {"/path/to/checker", "/path/to/file.epub"};
        String path = "/path/to/file.epub";

        // Act
        int returnCode = checker.processEpubFile(args);

        // Assert
        assertEquals(0, returnCode);
    }

}