package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsAudioTypeInvalidTest {

    @Test
    public void isAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

}