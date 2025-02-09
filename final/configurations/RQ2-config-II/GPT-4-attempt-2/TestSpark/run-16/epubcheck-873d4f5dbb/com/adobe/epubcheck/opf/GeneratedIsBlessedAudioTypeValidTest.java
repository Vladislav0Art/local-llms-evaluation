package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedAudioTypeValidTest {

    @Test
    public void isBlessedAudioTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

}