package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType {

    @Test
    public void testIsCommonVideoType() {
        String type = "image/x-png";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isCommonVideoType(type);
        Assert.assertTrue(result);
    }

}