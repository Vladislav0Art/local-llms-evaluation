package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetErrors {

    @Test
    public void testGetErrors() {
        // Arrange
        String epubFilePath = "path_to_valid_epub_file.epub";
        EPUBValidator validator = new EPUBValidator();

        // Act and Assert
        String errors = validator.getErrors(epubFilePath);
        assertNull(errors);
    }

}