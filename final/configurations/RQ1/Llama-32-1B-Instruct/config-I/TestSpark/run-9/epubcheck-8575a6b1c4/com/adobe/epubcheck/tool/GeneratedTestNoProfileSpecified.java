package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNoProfileSpecified {

    @Test
    public void testNoProfileSpecified() {
        // Arrange
        String[] args = {"profile", null, "file"};

        // Act
        boolean result = EpubCheck.main(args);

        // Assert
        assertFalse(result);
    }

}