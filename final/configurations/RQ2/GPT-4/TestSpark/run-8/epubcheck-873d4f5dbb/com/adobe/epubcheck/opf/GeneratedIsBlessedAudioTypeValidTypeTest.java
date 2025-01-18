package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeValidTypeTest {

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

}