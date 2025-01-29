package com.adobe.epubcheck.opf;

public class GeneratedCheckPackageCheck {

    @Test
    public void checkPackageCheck() {
        boolean result = OPFChecker30.isAudioType("audio");
        Assert.assertFalse(result, "should return false for audio type");
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("audio"), "should return false for blessed audio type");
        Assert.assertTrue(OPFChecker30.isVideoType("video"), "should return true for video type");

        result = OPFChecker30.isCommonVideoType("common");
        Assert.assertTrue(result, "should return false for common video type");
        Assert.assertFalse(OPFChecker30.isFontType("font"), "should return true for font type");
        Assert.assertFalse(OPFChecker30.isBlessedFontType("font"), "should return true for blessed font type");

        result = OPFChecker30.isCoreMediaType("audio");
        Assert.assertTrue(result, "should return false for core media type");
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("video"), "should return false for blessed video type");

        Assert.assertFalse(OPFChecker30.isBlessedScriptType("script"), "should return true for blessed script type");
    }

}