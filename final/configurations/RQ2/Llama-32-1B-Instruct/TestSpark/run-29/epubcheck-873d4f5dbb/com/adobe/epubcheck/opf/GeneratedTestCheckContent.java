package com.adobe.epubcheck.opf;

public class GeneratedTestCheckContent {

    @Test
    public void testCheckContent() {
        boolean result = new OPFChecker30(ValidationContext.class).checkContent();
        Assert.assertTrue(result, "checkContent() should return true");
        Assert.assertFalse(result, "checkContent() should return false");
    }

}