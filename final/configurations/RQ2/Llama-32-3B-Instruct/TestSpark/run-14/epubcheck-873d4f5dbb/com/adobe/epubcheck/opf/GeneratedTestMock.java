package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestMock {

    @Test
    public void testMock() {
        // Arrange
        EpubFile file = new EpubFile();
        ResourceValidation validation = new ResourceValidation();

        // Act and Assert
        EpubChecker checker = new EpubChecker();
        boolean result = checker.mock(validation);
        assertTrue(result);
    }

}