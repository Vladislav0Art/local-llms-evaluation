package com.adobe.epubcheck.opf;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        String type = "video/x-matroska";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isVideoType(type);
        Assert.assertTrue(result);
    }

}