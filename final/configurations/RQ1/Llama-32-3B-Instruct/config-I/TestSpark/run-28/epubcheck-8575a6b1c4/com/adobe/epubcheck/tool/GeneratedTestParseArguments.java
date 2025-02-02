package com.adobe.epubcheck.tool;

public class GeneratedTestParseArguments {

    @Test
    public void testParseArguments() {
        // Arrange
        String[] args = {"--mode", "custom", "--version"};
        Main main = new Main();
        List<String> parsedArgs = main.parseArguments(args);

        // Act

        // Assert
        assertEquals("custom", parsedArgs.get(1));
    }

}