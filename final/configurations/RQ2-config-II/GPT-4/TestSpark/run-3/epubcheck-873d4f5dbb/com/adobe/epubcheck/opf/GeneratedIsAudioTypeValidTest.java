package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsAudioTypeValidTest {

    @Test
    public void isAudioTypeValidTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp3"));
    }

}