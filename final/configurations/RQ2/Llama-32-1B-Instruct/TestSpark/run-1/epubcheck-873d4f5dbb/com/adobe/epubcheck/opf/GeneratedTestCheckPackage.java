package com.adobe.epubcheck.opf;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.checkPackage();
        Assert.assertTrue(result);
    }

}