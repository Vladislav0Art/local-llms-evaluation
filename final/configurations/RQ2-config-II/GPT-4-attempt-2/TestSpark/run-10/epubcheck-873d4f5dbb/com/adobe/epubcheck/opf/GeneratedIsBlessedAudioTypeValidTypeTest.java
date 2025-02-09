package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedAudioTypeValidTypeTest {

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        assertEquals(true, OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

}