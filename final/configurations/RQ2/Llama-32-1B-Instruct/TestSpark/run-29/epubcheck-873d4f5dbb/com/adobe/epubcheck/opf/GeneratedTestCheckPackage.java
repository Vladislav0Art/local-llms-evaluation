package com.adobe.epubcheck.opf;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        boolean result = new OPFChecker30(ValidationContext.class).checkPackage();
        Assert.assertTrue(result, "checkPackage() should return true");
        Assert.assertFalse(result, "checkPackage() should return false");
    }

}