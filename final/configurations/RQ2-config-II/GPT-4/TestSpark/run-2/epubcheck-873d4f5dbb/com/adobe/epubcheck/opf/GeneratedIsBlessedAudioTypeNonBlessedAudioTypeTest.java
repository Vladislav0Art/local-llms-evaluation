package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedAudioTypeNonBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeNonBlessedAudioTypeTest() {
        String type = "audio/aac";
        assertEquals(false, OPFChecker30.isBlessedAudioType(type));
    }

}