package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsBlessedFontTypeValidMediaTypeTest {

    @Test
    public void isBlessedFontTypeValidMediaTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/vnd.ms-opentype"));
        assertFalse(OPFChecker30.isBlessedFontType("application/pdf"));
    }

}