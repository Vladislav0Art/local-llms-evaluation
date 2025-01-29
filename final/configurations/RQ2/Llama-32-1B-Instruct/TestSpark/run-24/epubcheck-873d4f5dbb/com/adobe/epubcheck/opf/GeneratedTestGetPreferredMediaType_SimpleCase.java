package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_SimpleCase {

    @Test
    public void testGetPreferredMediaType_SimpleCase() {
        assertEquals("audio/video", OPFChecker30.getPreferredMediaType("audio/video", "test"));
    }

}