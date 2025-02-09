package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsAudioTypeTestForInvalidAudioType {

    @Test
    public void isAudioTypeTestForInvalidAudioType() {
        assertFalse(OPFChecker30.isAudioType("text/plain"));
    }

}