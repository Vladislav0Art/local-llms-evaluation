package com.adobe.epubcheck.opf;

public class GeneratedGetPreferredMediaTypeCheck {

    @Test
    public void getPreferredMediaTypeCheck() {
        String expected = "audio";
        String path = "";
        Assert.assertTrue(OPFChecker30.getPreferredMediaType(expected, path), "should return correct preferred media type");

        expected = "video";
        path = "";
        Assert.assertTrue(OPFChecker30.getPreferredMediaType(expected, path), "should return correct preferred media type");
    }

}