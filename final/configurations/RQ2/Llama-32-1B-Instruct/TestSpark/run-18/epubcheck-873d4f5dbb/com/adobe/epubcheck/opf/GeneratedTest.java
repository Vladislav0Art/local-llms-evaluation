package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testValidationContext() {
        ValidationContext context = new ValidationContext();
        assertEquals(1, context.getNamespace().size());
        assertEquals("OPF", context.getExtensionName());
        assertTrue(context.isAudioType("audio"));
        assertTrue(context.isBlessedAudioType("audio"));
        assertTrue(context.isVideoType("video"));
        assertTrue(context.isBlessedVideoType("video"));
    }

    @Test
    public void testInitHandler() {
        assertFalse(OPFChecker30.initHandler(), "Expected false");
    }

    @Test
    public void testIsAudioType() {
        assertEquals(true, OPFChecker30.isAudioType("audio"));
        assertTrue(OPFChecker30.isBlessedAudioType("audio"));
        assertFalse(OPFChecker30.isVideoType("video"), "Expected false");
        assertFalse(OPFChecker30.isBlessedVideoType("video"), "Expected true");
    }

    @Test
    public void testIsBlessedAudioType() {
        assertEquals(true, OPFChecker30.isBlessedAudioType("audio"));
        assertTrue(OPFChecker30.isBlessedVideoType("video"), "Expected false");
    }

    @Test
    public void testGetPreferredMediaType() {
        assertEquals("audio", OPFChecker30.getPreferredMediaType("audio", "file:///path/to/audio.mp3"));
        assertTrue(OPFChecker30.isBlessedAudioType("image/jpg"), "Expected true");
        assertTrue(OPFChecker30.isVideoType("video/mp4"), "Expected false");
    }

    @Test
    public void testIsVideoType() {
        assertEquals(true, OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedAudioType("image/jpg"), "Expected false");
    }

}