package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestDisplayHelp {

    @Test
    public void testDisplayHelp() {
        // Arrange
        String[] args = {"--help"};

        // Act
        EpubCheck epubCheck = new EpubCheck();

        // Assert
        assertTrue(epubCheck.displayHelp());
    }

}