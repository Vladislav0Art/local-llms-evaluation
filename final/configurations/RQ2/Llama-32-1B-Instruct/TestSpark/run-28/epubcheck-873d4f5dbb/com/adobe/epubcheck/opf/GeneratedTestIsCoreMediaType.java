package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

    @Test
    public void testIsCoreMediaType() {
        assertEquals("application/x-mpegurl", OPFChecker30.isCoreMediaType("audio"));
        assertEquals("", OPFChecker30.isCoreMediaType(""));
        assertEquals("application/x-mpegurl", OPFChecker30.isCoreMediaType("video"));
        assertEquals("", OPFChecker30.isCoreMediaType("video"));
    }

}