package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType {

    @Test
    public void testIsCommonVideoType() {
        assertEquals("video/mpeg", OPFChecker30.isCommonVideoType("video"));
        assertEquals("", OPFChecker30.isCommonVideoType(""));
        assertEquals("video/mpeg", OPFChecker30.isCommonVideoType("mpeg"));
        assertEquals("", OPFChecker30.isCommonVideoType("mpeg"));
    }

}