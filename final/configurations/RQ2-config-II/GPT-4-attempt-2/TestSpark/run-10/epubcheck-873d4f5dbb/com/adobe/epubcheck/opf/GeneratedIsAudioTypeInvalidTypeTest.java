package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsAudioTypeInvalidTypeTest {

    @Test
    public void isAudioTypeInvalidTypeTest() {
        assertEquals(false, OPFChecker30.isAudioType("video/avi"));
    }

}