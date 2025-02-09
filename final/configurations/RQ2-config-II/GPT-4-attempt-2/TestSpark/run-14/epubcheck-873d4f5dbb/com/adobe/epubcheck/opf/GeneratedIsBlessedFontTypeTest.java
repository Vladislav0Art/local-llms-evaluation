package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeTest() {
        boolean result = OPFChecker30.isBlessedFontType("font/woff");
        assertTrue(result);
    }

}