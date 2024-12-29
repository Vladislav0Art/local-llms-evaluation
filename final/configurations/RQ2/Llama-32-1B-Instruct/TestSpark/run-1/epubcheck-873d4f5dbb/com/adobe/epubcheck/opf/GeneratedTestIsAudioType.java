package com.adobe.epubcheck.opf;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        String type = "audio/x-m4a";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isAudioType(type);
        Assert.assertTrue(result);
    }

}