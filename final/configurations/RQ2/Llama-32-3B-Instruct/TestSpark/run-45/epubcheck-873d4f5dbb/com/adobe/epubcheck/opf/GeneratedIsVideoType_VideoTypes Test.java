package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsVideoType_VideoTypes Test {

    @Test
    public void isVideoType_VideoTypes

    Test() {
        assertTrue(OPFChecker30.isVideoType("video"));
        assertFalse(OPFChecker30.isVideoType("audio"));
    }

}