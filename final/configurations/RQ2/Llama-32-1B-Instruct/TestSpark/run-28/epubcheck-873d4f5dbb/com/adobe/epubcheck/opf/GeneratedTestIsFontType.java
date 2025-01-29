package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType {

    @Test
    public void testIsFontType() {
        assertEquals("application/ttf", OPFChecker30.isFontType("font"));
        assertEquals("", OPFChecker30.isFontType(""));
        assertEquals("application/ttf", OPFChecker30.isFontType("tiff"));
        assertEquals("", OPFChecker30.isFontType("tiff"));
    }

}