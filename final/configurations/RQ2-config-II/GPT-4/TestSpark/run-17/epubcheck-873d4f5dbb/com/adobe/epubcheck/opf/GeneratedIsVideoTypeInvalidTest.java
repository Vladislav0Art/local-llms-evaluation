package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsVideoTypeInvalidTest {

    @Test
    public void isVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isVideoType("audio/mp4"));
    }

}