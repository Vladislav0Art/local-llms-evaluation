package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsVideoTypeValidTypeTest {

    @Test
    public void isVideoTypeValidTypeTest() {
        assertEquals(true, OPFChecker30.isVideoType("video/mp4"));
    }

}