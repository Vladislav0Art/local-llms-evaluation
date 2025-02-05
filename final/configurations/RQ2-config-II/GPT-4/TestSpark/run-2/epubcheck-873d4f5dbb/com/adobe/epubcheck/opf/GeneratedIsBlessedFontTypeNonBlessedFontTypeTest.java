package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedFontTypeNonBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeNonBlessedFontTypeTest() {
        String type = "application/x-font-ttf";
        assertEquals(false, OPFChecker30.isBlessedFontType(type));
    }

}