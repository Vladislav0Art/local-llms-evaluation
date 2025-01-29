package com.adobe.epubcheck.opf;

public class GeneratedInitHandlerCheck {

    @Test
    public void initHandlerCheck() {
        OPFChecker30 checker = new OPFChecker30(ValidationContext.class);
        Assert.assertTrue(checker.initHandler());
    }

}