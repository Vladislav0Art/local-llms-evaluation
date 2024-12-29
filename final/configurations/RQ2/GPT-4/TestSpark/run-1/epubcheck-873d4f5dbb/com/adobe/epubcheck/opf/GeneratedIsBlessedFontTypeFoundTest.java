package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedFontTypeFoundTest {

    @Test
    public void isBlessedFontTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/ttf"));
    }

}