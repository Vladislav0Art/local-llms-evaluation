package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestDisplayVersionWithMode {

    @Test
    public void testDisplayVersionWithMode() {
        // Arrange
        String[] args = {"--version", "mode"};

        // Act
        EpubCheck epubCheck = new EpubCheck();
        boolean expectedOutput = true;
        epubCheck.mode = mode;

        // Assert
        assertTrue(epubCheck.displayVersion());
    }

}