package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsBlessedAudioType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsBlessedAudioType() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("image/jpg"));
    }

}