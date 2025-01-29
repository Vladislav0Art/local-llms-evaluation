package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        assertEquals(true, OPFChecker30.isBlessedAudioType("audio"));
        assertTrue(OPFChecker30.isBlessedVideoType("video"), "Expected false");
    }

}