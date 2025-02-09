package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsVideoTypeTrueTest {

    @Test
    public void isVideoTypeTrueTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}