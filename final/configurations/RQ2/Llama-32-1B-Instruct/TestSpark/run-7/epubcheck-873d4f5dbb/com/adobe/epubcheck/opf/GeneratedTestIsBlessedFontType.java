package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType {

    @Test
    public void testIsBlessedFontType() {
        assertTrue(OPFChecker30.isBlessedFontType("application/x-font-family"));
        assertFalse(OPFChecker30.isBlessedFontType("image/jpeg"));
    }

}