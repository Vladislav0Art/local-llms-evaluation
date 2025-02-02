package com.adobe.epubcheck.tool;

public class GeneratedTestDisplayVersion {

    @Test
    public void testDisplayVersion() {
        // Arrange
        Main main = new Main();
        List<String> args = new ArrayList<>();

        // Act
        boolean result = main.displayVersion(args);

        // Assert
        assertTrue(result);
    }

}