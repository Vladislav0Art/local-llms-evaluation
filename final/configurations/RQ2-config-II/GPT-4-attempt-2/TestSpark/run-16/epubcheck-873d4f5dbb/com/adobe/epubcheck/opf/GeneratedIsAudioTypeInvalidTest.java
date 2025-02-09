package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeInvalidTest {

    @Test
    public void isAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isAudioType("audio/abc"));
    }

}