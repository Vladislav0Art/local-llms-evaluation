package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedCheckPackageWithNullContextTest {

    @Test
    public void checkPackageWithNullContextTest() {
        ValidationContext context = null;
        OPFChecker30 checker = new OPFChecker30(context);
        boolean result = checker.checkPackage();
        assertFalse(result);
    }

}