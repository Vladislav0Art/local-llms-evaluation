package com.adobe.epubcheck.opf;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        String type = "audio/binaural";
        OPFChecker30 checker = new OPFChecker30(null);
        boolean result = checker.isBlessedAudioType(type);
        Assert.assertTrue(result);
    }

}