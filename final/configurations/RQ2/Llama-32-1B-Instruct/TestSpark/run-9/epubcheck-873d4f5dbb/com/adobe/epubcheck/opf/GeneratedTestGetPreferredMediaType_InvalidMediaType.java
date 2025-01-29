package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetPreferredMediaType_InvalidMediaType {

    @Test
    public void testGetPreferredMediaType_InvalidMediaType() {
        assertEquals("unknown", OPFChecker30.getPreferredMediaType("video", "/invalid/video.mp4"));
    }

}