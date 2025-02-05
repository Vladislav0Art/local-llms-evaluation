package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsVideoTypeValidTest {

    @Test
    public void isVideoTypeValidTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}