package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeValidMediaTypeTest {

    @Test
    public void isBlessedAudioTypeValidMediaTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

}