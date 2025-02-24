package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testCheckPackage() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkPackage();

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testCheckContent() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkContent();

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testCheckItem() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkItem(new OPFItem(), new OPFHandler());

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        checker.checkItemAfterResourceValidation(new OPFItem());
    }

    @Test
    public void testCheckSpineItem() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        boolean result = checker.checkSpineItem(new OPFItem(), new OPFHandler());

        // Assert
        assertEquals(true, result);
    }

}