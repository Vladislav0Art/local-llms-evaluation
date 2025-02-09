package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedAudioTypeInvalidTypeTest {

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        assertEquals(false, OPFChecker30.isBlessedAudioType("audio/avi"));
    }

}