package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetPreferredMediaTypeWithNullVideoPath {

    @Test
    public void testGetPreferredMediaTypeWithNullVideoPath() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType(null, "/path/to/video.mp4"));
    }

}