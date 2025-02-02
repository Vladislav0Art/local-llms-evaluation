package com.adobe.epubcheck.tool;

public class GeneratedTestSetCustomMessageFileFromEnvironment {

    @Test
    public void testSetCustomMessageFileFromEnvironment() {
        // Arrange
        System.setProperty(EPUBCHECK_CUSTOM_MESSAGE_FILE, "custom_messages.properties");
        Main main = new Main();
        List<String> args = new ArrayList<>();

        // Act
        boolean result = main.setCustomMessageFileFromEnvironment(args);

        // Assert
        assertTrue(result);
    }

}