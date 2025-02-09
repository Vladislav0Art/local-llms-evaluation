package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsVideoTypeInvalidTest {

    @Test
    public void isVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isVideoType("video/mp7"));
    }

}