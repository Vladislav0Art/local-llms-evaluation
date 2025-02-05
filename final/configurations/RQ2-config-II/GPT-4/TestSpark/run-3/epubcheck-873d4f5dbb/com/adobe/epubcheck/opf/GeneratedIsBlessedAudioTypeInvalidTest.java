package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeInvalidTest {

    @Test
    public void isBlessedAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("video/mp4"));
    }

}