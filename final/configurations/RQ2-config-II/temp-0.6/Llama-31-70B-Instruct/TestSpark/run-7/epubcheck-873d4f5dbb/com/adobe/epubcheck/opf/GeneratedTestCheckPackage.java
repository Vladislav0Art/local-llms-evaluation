package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertTrue(opfChecker30.checkPackage());
    }

}