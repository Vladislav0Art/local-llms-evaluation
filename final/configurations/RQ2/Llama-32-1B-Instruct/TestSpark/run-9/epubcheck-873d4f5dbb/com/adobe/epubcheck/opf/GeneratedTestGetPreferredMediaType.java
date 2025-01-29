package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetPreferredMediaType {

    @Test
    public void testGetPreferredMediaType() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType("video", "/path/to/video.mp4"));
    }

}