package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType {

    @Test
    public void testIsCoreMediaType() {
        assertTrue(OPFChecker30.isCoreMediaType("audio/mpeg"));
        assertFalse(OPFChecker30.isCoreMediaType("image/jpeg"));
    }

}