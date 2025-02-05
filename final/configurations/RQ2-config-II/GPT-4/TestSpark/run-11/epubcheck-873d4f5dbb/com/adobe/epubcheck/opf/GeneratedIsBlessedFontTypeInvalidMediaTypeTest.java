package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsBlessedFontTypeInvalidMediaTypeTest {

    @Test
    public void isBlessedFontTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("invalid/font"));
    }

}