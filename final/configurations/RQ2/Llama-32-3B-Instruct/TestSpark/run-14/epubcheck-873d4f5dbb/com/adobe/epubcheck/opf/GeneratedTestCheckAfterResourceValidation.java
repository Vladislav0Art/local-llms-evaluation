package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCheckAfterResourceValidation {

    @Test
    public void testCheckAfterResourceValidation() {
        // Arrange
        EpubFile file = new EpubFile();
        file.setTitle("title");
        file.setAuthor("author");
        file.setContent("<html><body>Hello World!</body></html>");
        ResourceValidation validation = new ResourceValidation();

        // Act and Assert
        EpubChecker checker = new EpubChecker();
        boolean result = checker.checkItemAfterResourceValidation(file, validation);
        assertTrue(result);
    }

}