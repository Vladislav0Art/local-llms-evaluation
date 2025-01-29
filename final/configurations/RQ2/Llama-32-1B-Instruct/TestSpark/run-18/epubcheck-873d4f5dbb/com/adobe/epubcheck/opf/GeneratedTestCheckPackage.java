package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        assertTrue(OPFChecker30.isAudioType("audio"));
        assertTrue(OPFChecker30.isBlessedAudioType("audio"));
        assertTrue(OPFChecker30.isVideoType("video"));
        assertTrue(OPFChecker30.isBlessedVideoType("video"));
    }

}