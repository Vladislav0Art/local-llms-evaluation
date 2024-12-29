package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeFoundTest {

    @Test
    public void isBlessedAudioTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

}