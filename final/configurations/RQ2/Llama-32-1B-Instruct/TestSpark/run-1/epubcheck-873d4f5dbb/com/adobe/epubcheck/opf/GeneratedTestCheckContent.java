package com.adobe.epubcheck.opf;

public class GeneratedTestCheckContent {

    @Test
    public void testCheckContent() {
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.checkContent();
        Assert.assertTrue(result);
    }

}