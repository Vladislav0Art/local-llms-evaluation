package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsAudioTypeTestForValidAudioType {

    @Test
    public void isAudioTypeTestForValidAudioType() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

}