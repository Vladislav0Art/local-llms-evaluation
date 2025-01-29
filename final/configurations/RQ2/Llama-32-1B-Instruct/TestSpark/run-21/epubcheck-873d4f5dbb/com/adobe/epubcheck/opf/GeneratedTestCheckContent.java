package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestCheckContent {

    @Test
    public void testCheckContent() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        assertFalse(checker.checkContent());
        assertTrue(checker.checkContent());
    }

}