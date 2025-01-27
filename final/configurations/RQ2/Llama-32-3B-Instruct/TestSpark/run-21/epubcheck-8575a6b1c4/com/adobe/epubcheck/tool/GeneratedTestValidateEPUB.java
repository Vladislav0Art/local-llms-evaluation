package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestValidateEPUB {

    @Test
    public void testValidateEPUB() {
        // Arrange
        String epubFilePath = "path_to_valid_epub_file.epub";
        EPUBValidator validator = new EPUBValidator();

        // Act and Assert
        boolean isValid = validator.validate(epubFilePath);
        assertTrue(isValid);
    }

}