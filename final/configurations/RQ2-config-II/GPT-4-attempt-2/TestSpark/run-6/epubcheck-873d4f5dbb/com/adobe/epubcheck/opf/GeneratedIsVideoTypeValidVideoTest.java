package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsVideoTypeValidVideoTest {

    @Test
    public void isVideoTypeValidVideoTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}