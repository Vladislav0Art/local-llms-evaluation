package com.adobe.epubcheck.opf;

public class GeneratedTestIsFontType {

    @Test
    public void testIsFontType() {
        String type = "font/tff";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isFontType(type);
        Assert.assertTrue(result);
    }

}