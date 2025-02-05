package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeValidTest {

    @Test
    public void isBlessedFontTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff2"));
    }

}