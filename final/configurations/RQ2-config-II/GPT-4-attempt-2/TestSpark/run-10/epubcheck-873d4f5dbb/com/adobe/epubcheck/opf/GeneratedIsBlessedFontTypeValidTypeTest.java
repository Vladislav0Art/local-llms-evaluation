package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedFontTypeValidTypeTest {

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        assertEquals(true, OPFChecker30.isBlessedFontType("font/woff"));
    }

}