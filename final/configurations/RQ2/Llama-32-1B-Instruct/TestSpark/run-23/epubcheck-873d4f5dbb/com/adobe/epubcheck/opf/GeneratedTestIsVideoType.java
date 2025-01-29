package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsVideoType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsVideoType() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("image/png"));
    }

}