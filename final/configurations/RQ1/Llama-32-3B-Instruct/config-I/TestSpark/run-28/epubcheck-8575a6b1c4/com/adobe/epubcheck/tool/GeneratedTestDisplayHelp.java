package com.adobe.epubcheck.tool;

public class GeneratedTestDisplayHelp {

    @Test
    public void testDisplayHelp() {
        // Arrange
        Main main = new Main();
        List<String> args = new ArrayList<>();
        args.add("--help");

        // Act
        boolean result = main.displayHelp(args);

        // Assert
        assertTrue(result);
    }

}