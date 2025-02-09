package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsVideoTypeInvalidTypeTest {

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("video/invalid"));
    }

}