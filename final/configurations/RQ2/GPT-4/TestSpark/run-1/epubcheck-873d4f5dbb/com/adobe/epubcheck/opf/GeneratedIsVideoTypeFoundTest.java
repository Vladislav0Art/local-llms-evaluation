package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsVideoTypeFoundTest {

    @Test
    public void isVideoTypeFoundTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}