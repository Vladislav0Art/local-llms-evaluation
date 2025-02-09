package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckPackageValidContextTest {

    @Test
    public void checkPackageValidContextTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkPackage();
        // Add relevant assertions
    }

}