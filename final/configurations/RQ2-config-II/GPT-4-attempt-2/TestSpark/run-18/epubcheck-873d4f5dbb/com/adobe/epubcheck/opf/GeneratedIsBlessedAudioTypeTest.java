package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

}