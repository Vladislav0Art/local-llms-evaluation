package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsAudioTypeNonAudioTypeTest {

    @Test
    public void isAudioTypeNonAudioTypeTest() {
        String type = "video/mp4";
        assertEquals(false, OPFChecker30.isAudioType(type));
    }

}