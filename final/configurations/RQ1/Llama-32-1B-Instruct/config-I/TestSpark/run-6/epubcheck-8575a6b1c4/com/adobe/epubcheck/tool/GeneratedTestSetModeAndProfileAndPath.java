package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestSetModeAndProfileAndPath {

    @Test
    public void testSetModeAndProfileAndPath() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

}