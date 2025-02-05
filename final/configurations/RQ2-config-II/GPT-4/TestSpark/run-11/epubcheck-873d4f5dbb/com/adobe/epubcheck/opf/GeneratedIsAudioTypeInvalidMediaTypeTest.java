package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsAudioTypeInvalidMediaTypeTest {

    @Test
    public void isAudioTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isAudioType("invalid/audio"));
    }

}