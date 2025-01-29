package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        assertTrue(OPFChecker30.isAudioType("audio"));
        assertFalse(OPFChecker30.isAudioType("video"));
    }

}