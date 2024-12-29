package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedFontType {

    @Test
    public void testIsBlessedFontType() {
        String type = "font/ttf";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isBlessedFontType(type);
        Assert.assertTrue(result);
    }

}