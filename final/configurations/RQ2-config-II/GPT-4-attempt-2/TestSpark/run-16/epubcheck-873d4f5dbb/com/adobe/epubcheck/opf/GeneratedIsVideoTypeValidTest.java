package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsVideoTypeValidTest {

    @Test
    public void isVideoTypeValidTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}