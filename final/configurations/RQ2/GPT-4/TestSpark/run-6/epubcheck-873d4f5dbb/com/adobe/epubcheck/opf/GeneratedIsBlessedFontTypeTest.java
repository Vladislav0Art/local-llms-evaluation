package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
        assertFalse(OPFChecker30.isBlessedFontType("font/opentype"));
    }

}