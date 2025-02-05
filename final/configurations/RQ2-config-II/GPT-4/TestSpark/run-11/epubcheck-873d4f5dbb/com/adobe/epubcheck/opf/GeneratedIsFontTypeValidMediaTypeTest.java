package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsFontTypeValidMediaTypeTest {

    @Test
    public void isFontTypeValidMediaTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/vnd.ms-opentype"));
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

}