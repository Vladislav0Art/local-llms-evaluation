package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemAfterResourceValidationValidItemTest {

    @Test
    public void checkItemAfterResourceValidationValidItemTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(item);
        // Add relevant assertions
    }

}