package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        assertTrue(checker.checkPackage());
        assertFalse(checker.checkPackage());
    }

}