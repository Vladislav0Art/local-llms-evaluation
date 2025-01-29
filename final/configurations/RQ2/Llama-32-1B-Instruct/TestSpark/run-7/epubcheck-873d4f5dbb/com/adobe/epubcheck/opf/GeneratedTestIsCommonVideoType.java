package com.adobe.epubcheck.opf;

public class GeneratedTestIsCommonVideoType {

    @Test
    public void testIsCommonVideoType() {
        assertTrue(OPFChecker30.isCommonVideoType("video/webm"));
        assertFalse(OPFChecker30.isCommonVideoType("image/jpeg"));
    }

}