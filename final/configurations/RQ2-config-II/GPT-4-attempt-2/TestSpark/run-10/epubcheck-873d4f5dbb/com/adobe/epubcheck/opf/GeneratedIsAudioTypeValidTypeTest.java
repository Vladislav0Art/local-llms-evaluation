package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsAudioTypeValidTypeTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        assertEquals(true, OPFChecker30.isAudioType("audio/mpeg"));
    }

}