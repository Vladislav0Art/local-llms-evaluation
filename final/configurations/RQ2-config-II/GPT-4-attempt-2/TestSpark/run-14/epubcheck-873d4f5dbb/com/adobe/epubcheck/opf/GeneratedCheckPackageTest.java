package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        ValidationContext context = new ValidationContext(EPUBVersion.VERSION_3, "path", "mimetype");
        OPFChecker30 checker = new OPFChecker30(context);

        boolean result = checker.checkPackage();

        assertTrue(result);
    }

}