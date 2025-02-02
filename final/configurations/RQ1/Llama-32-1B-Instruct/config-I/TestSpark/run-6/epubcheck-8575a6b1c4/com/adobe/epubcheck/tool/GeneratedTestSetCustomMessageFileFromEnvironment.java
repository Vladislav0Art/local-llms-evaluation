package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestSetCustomMessageFileFromEnvironment {

    @Test
    public void testSetCustomMessageFileFromEnvironment() {
        // Arrange
        String[] env = {"/path/to/custom/message/file"};
        boolean expectedCustomMessageFile = false;

        // Act
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.setCustomMessageFileFromEnvironment(env, expectedCustomMessageFile);

        // Assert
        assertTrue(epubCheck.customMessageFile() != null);
        assertTrue(epubCheck.useCustomMessageFile());
        assertTrue(expectedCustomMessageFile);
    }

}