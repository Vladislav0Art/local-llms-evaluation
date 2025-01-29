package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        assertTrue(OPFChecker30.isBlessedAudioType("bible"));
        assertFalse(OPFChecker30.isBlessedAudioType("video"));
    }

}