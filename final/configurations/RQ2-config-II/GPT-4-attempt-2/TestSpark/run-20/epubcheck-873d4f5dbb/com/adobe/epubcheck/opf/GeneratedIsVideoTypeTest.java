package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mpeg"));
        assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

}