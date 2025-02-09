package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsVideoTypeInvalidTypeTest {

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertEquals(false, OPFChecker30.isVideoType("audio/mp3"));
    }

}