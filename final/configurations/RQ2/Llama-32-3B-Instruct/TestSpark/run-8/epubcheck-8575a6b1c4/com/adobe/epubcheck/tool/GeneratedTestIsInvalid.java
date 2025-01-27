package com.adobe.epubcheck.tool;

public class GeneratedTestIsInvalid {

    @org.junit.Test
    public void testValidateFormat() throws Exception {
        EpubCheck checker = new EpubCheck();
        boolean isValid = checker.validateFormat("epub3");
        org.junit.Assert.assertTrue(isValid);
    }

    @Test
    public void testIsInvalid() {
        EpubCheck checker = new EpubCheck();
        String invalidFormat = "pdf";
        boolean isValid = checker.validateFormat(invalidFormat);
        org.junit.Assert.assertFalse(isValid);
    }

    @org.junit.Test
    public void testValidateMetadata() throws Exception {
        EpubCheck checker = new EpubCheck();
        boolean isValid = checker.validateMetadata("https://example.com/metadata");
        org.junit.Assert.assertTrue(isValid);
    }

}