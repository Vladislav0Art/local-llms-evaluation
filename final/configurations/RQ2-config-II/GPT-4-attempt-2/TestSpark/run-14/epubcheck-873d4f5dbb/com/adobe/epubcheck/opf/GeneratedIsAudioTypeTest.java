package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        boolean result = OPFChecker30.isAudioType("audio/mp3");
        assertTrue(result);
    }

}