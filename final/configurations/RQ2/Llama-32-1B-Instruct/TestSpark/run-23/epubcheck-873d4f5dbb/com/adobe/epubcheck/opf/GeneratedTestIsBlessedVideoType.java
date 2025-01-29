package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsBlessedVideoType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsBlessedVideoType() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("image/png"));
    }

}