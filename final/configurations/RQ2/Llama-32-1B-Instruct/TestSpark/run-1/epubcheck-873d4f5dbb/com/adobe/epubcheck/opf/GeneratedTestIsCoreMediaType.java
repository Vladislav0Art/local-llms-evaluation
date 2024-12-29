package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

    @Test
    public void testIsCoreMediaType() {
        String type = "image/x-ico";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isCoreMediaType(type);
        Assert.assertTrue(result);
    }

}