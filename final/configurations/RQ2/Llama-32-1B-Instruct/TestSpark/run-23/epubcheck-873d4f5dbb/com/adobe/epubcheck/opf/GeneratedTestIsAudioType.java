package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsAudioType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsAudioType() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("image/jpg"));
    }

}