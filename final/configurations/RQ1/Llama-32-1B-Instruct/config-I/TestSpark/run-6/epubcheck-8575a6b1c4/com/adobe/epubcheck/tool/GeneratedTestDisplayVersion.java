package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestDisplayVersion {

    @Test
    public void testDisplayVersion() {
        // Arrange
        String[] args = {"--version"};

        // Act
        EpubCheck epubCheck = new EpubCheck();

        // Assert
        assertTrue(epubCheck.displayVersion());
    }

}