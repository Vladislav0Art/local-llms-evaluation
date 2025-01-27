package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCheckFile {

    @Test
    public void testCheckFile() {
        // Arrange
        EpubFile file = new EpubFile();
        file.setTitle("title");
        file.setAuthor("author");
        file.setContent("<html><body>Hello World!</body></html>");

        // Act and Assert
        EpubChecker checker = new EpubChecker();
        boolean result = checker.checkFile(file);
        assertTrue(result);
    }

}