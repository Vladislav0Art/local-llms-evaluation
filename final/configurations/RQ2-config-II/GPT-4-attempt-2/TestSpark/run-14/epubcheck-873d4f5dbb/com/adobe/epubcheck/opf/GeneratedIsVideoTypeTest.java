package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        boolean result = OPFChecker30.isVideoType("video/mp4");
        assertTrue(result);
    }

}