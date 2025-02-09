package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

}