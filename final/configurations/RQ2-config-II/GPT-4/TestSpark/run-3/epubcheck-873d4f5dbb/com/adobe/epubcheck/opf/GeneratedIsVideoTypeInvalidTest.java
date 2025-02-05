package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsVideoTypeInvalidTest {

    @Test
    public void isVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isVideoType("audio/mp3"));
    }

}