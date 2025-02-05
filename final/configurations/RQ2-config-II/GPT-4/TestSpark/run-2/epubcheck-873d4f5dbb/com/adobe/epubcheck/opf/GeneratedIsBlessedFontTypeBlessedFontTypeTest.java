package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedFontTypeBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeBlessedFontTypeTest() {
        String type = "application/font-woff";
        assertEquals(true, OPFChecker30.isBlessedFontType(type));
    }

}