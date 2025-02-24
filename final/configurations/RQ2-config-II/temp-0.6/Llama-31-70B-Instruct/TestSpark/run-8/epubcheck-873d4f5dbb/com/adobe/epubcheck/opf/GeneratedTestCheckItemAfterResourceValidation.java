package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCheckItemAfterResourceValidation {

    @Test
    public void testCheckItemAfterResourceValidation() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        checker.checkItemAfterResourceValidation(new OPFItem());
    }

}