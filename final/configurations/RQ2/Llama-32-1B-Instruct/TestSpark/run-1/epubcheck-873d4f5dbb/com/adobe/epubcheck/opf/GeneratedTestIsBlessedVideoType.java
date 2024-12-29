package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedVideoType {

    @Test
    public void testIsBlessedVideoType() {
        String type = "video/bmp";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isBlessedVideoType(type);
        Assert.assertTrue(result);
    }

}