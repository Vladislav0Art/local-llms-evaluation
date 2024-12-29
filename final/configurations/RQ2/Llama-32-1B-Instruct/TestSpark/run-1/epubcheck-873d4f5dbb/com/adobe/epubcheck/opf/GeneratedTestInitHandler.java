package com.adobe.epubcheck.opf;

public class GeneratedTestInitHandler {

    @Test
    public void testInitHandler() {
        OPFChecker30 checker = new OPFChecker30(null);
        Assert.assertTrue(checker.initHandler());
    }

}