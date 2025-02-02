package com.adobe.epubcheck.tool;

public class GeneratedTestNoMatchingArgument {

    @Test
    public void testNoMatchingArgument() {
        // Arrange
        String[] args = {"--locale", "de"};
        Main main = new Main();
        List<String> parsedArgs = main.parseArguments(args);

        // Act

        // Assert
        assertTrue(parsedArgs.isEmpty());
    }

}