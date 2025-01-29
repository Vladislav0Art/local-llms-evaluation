package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType {

    @Test
    public void testIsFontType() {
        assertTrue(OPFChecker30.isFontType("application/x-font-family"));
        assertFalse(OPFChecker30.isFontType("image/jpeg"));
    }

}