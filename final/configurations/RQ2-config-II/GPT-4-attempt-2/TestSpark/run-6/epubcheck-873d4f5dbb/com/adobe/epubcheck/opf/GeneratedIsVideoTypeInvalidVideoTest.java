package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsVideoTypeInvalidVideoTest {

    @Test
    public void isVideoTypeInvalidVideoTest() {
        assertFalse(OPFChecker30.isVideoType("audio/mp3"));
    }

}