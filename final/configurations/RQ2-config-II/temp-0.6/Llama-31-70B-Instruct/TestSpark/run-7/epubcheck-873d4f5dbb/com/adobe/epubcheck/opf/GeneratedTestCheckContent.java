package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCheckContent {

    @Test
    public void testCheckContent() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertTrue(opfChecker30.checkContent());
    }

}