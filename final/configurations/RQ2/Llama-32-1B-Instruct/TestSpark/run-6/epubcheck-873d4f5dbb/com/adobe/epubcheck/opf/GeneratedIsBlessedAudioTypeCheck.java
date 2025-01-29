package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedAudioTypeCheck {

    @Test
    public void isBlessedAudioTypeCheck() {
        boolean result = OPFChecker30.isBlessedAudioType("audio");
        Assert.assertFalse(result, "should return false for audio type");

        result = OPFChecker30.isBlessedAudioType("video");
        Assert.assertTrue(result, "should return true for video blessed audio type");

        result = OPFChecker30.isBlessedVideoType("common");
        Assert.assertFalse(result, "should return false for common video type");
    }

}