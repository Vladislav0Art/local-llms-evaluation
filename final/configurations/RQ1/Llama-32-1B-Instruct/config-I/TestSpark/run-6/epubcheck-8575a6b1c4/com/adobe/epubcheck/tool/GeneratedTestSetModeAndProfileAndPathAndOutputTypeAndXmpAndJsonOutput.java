package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonOutput {

    @Test
    public void testSetModeAndProfileAndPathAndOutputTypeAndXmpAndJsonOutput() {
        // Arrange
        String[] args = {"--mode", "profile", "--path", "/path/to/file", "--output-type", "xmp", "--output-type", "json"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

}