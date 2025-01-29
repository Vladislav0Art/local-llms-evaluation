package com.adobe.epubcheck.tool;

public class GeneratedTestRun {

    @Test
    public void testRun() {
        // Arrange
        String[] args = {"/path/to/file.epub"};

        // Act
        int result = EpubChecker.run(args);

        // Assert
        assertEquals(0, result); // implementation omitted for brevity
    }

}