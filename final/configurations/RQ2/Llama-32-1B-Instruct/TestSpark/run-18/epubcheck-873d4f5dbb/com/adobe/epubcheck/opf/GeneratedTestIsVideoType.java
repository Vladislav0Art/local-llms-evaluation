package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        assertEquals(true, OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedAudioType("image/jpg"), "Expected false");
    }

}