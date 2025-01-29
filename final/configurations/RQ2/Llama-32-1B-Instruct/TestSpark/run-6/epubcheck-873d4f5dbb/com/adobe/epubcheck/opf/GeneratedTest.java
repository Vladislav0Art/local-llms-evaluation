package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void initHandlerCheck() {
        OPFChecker30 checker = new OPFChecker30(ValidationContext.class);
        Assert.assertTrue(checker.initHandler());
    }

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

    @Test
    public void checkItemCheck() {
        boolean result = OPFChecker30.checkContent();
        Assert.assertTrue(result, "should return false for invalid content");
        Assert.assertTrue(OPFChecker30.checkItemAfterResourceValidation(null), "should throw exception when null is passed");

        OPFItem item1 = new OPFItem("item1", new Reference(), new URLFragment());
        OPFItem item2 = new OPFItem("item2", new Reference(), new URLFragment());
        Assert.assertTrue(OPFChecker30.checkContent().contains(item1), "should return true for item1");
        Assert.assertFalse(OPFChecker30.checkContent().contains(item2), "should return false for item2");

        Assert.assertTrue(OPFChecker30.isAudioType("audio"), "should return false for audio type when not a resource");
    }

    @Test
    public void checkItemAfterResourceValidationCheck() {
        boolean result = OPFChecker30.checkContent();
        Assert.assertTrue(result, "should return false for invalid content");
        Assert.assertTrue(OPFChecker30.checkItemAfterResourceValidation(null), "should throw exception when null is passed");

        OPFItem item1 = new OPFItem("item1", new Reference(), new URLFragment());
        Assert.assertTrue(OPFChecker30.checkContent().contains(item1), "should return true for item1 after resource validation");
    }

    @Test
    public void checkSpineItemCheck() {
        boolean result = OPFChecker30.checkSpineItem(null, null);
        Assert.assertFalse(result, "should throw exception when invalid spine item is passed");

        Assert.assertTrue(OPFChecker30.checkSpineItem(new OPFItem("item1", new Reference(), new URLFragment()), new Reference(), new URLFragment()), "should return true for valid spine item");
    }

    @Test
    public void getPreferredMediaTypeCheck() {
        String expected = "audio";
        String path = "";
        Assert.assertTrue(OPFChecker30.getPreferredMediaType(expected, path), "should return correct preferred media type");

        expected = "video";
        path = "";
        Assert.assertTrue(OPFChecker30.getPreferredMediaType(expected, path), "should return correct preferred media type");
    }

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