package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestSetModeAndProfile {

    @Test
    public void testSetModeAndProfile() {
        // Arrange
        String[] args = {"--mode", "profile"};
        boolean expectedOutput = true;
        EpubCheck epubCheck = new EpubCheck();
        epubCheck.mode = mode;
        assertTrue(epubCheck.setCustomMessageFileFromEnvironment(args, expectedOutput));
    }

}