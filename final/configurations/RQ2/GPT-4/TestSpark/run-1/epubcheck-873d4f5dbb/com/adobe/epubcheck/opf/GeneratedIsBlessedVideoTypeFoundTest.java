package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedVideoTypeFoundTest {

    @Test
    public void isBlessedVideoTypeFoundTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}