package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        assertEquals(true, OPFChecker30.isAudioType("audio"));
        assertTrue(OPFChecker30.isBlessedAudioType("audio"));
        assertFalse(OPFChecker30.isVideoType("video"), "Expected false");
        assertFalse(OPFChecker30.isBlessedVideoType("video"), "Expected true");
    }

}