package com.adobe.epubcheck.opf;

public class GeneratedCheckItemAfterResourceValidationCheck {

    @Test
    public void checkItemAfterResourceValidationCheck() {
        boolean result = OPFChecker30.checkContent();
        Assert.assertTrue(result, "should return false for invalid content");
        Assert.assertTrue(OPFChecker30.checkItemAfterResourceValidation(null), "should throw exception when null is passed");

        OPFItem item1 = new OPFItem("item1", new Reference(), new URLFragment());
        Assert.assertTrue(OPFChecker30.checkContent().contains(item1), "should return true for item1 after resource validation");
    }

}