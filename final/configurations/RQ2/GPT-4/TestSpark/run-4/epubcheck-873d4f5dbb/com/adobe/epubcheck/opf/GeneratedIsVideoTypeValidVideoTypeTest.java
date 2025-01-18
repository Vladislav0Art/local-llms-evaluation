package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsVideoTypeValidVideoTypeTest {

    @Test
    public void isVideoTypeValidVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}