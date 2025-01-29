package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetPreferredMediaType {

    @Test
    public void testGetPreferredMediaType() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType("audio", "file:///path/to/audio.mp3"));
        assertTrue(OPFChecker30.isBlessedAudioType("image/jpg"), "Expected true");
        assertTrue(OPFChecker30.isVideoType("video/mp4"), "Expected false");
    }

}