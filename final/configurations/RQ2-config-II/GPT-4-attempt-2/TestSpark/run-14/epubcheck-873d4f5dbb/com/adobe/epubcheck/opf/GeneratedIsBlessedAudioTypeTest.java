package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        boolean result = OPFChecker30.isBlessedAudioType("audio/mp3");
        assertTrue(result);
    }

}