package com.adobe.epubcheck.opf;

public class GeneratedCheckItemCheck {

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

}