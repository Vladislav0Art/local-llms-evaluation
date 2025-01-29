package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType {

    @Test
    public void testIsBlessedFontType() {
        assertEquals("application/x-tiff", OPFChecker30.isBlessedFontType("font"));
        assertEquals("", OPFChecker30.isBlessedFontType(""));
        assertEquals("application/x-tiff", OPFChecker30.isBlessedFontType("tiff"));
        assertEquals("", OPFChecker30.isBlessedFontType("tiff"));
    }

}