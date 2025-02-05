package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedAudioTypeBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeBlessedAudioTypeTest() {
        String type = "audio/mpeg";
        assertEquals(true, OPFChecker30.isBlessedAudioType(type));
    }

}