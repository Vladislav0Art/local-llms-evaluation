package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeValidTest {

    @Test
    public void isAudioTypeValidTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

}