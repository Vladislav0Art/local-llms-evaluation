package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestOPFChecker30WithInvalidVideoPath {

    @Test
    public void testOPFChecker30WithInvalidVideoPath() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType("video", "/path/to/invalid video.mp4"));
    }

}