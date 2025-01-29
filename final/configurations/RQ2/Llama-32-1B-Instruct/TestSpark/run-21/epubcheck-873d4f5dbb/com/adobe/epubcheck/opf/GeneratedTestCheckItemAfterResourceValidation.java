package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestCheckItemAfterResourceValidation {

    @Test
    public void testCheckItemAfterResourceValidation() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        try {
            checker.checkItemAfterResourceValidation(null);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

}