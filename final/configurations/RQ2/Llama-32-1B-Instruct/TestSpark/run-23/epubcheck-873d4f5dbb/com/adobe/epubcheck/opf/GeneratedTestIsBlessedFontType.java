package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsBlessedFontType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsBlessedFontType() {
        assertTrue(OPFChecker30.isBlessedFontType("font/ttf"));
        assertFalse(OPFChecker30.isBlessedFontType("image/png"));
    }

}