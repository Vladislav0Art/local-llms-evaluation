package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetPreferredMediaType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testGetPreferredMediaType() {
        String path = "/path/to/audio/mpeg.mp3";
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType(path, profile));
    }

}