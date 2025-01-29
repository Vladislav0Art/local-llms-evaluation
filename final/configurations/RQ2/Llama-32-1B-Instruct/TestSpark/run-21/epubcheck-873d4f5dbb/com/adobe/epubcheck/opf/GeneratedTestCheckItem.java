package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestCheckItem {

    @Test
    public void testCheckItem() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        try {
            checker.checkItem(null, null);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

}