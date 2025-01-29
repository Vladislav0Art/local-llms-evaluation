package com.adobe.epubcheck.opf;

public class GeneratedCheckSpineItemCheck {

    @Test
    public void checkSpineItemCheck() {
        boolean result = OPFChecker30.checkSpineItem(null, null);
        Assert.assertFalse(result, "should throw exception when invalid spine item is passed");

        Assert.assertTrue(OPFChecker30.checkSpineItem(new OPFItem("item1", new Reference(), new URLFragment()), new Reference(), new URLFragment()), "should return true for valid spine item");
    }

}