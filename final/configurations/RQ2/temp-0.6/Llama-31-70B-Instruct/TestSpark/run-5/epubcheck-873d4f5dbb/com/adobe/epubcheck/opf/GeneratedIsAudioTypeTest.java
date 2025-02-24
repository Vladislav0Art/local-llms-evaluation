package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        String type = "audio/mpeg";
        assertTrue(OPFChecker30.isAudioType(type));
    }

}