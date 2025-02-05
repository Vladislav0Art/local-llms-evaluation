package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsAudioTypeAudioTypeTest {

    @Test
    public void isAudioTypeAudioTypeTest() {
        String type = "audio/mpeg";
        assertEquals(true, OPFChecker30.isAudioType(type));
    }

}