package com.adobe.epubcheck.tool;

public class GeneratedTestRun {

    @Test
    public void testRun() {
        // Arrange
        EpubChecker checker = new EpubChecker();
        String[] args = {"/path/to/checker", "-v", "3.0"};
        int returnCode = 0;
        String path = "/path/to/_checker";

        // Act
        int result = checker.run(args);

        // Assert
        assertEquals(0, returnCode);
    }

}