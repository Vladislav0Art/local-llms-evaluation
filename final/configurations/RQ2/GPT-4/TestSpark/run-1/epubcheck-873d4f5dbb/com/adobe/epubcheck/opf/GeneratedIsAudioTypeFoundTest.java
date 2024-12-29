package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsAudioTypeFoundTest {

    @Test
    public void isAudioTypeFoundTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp3"));
    }

}