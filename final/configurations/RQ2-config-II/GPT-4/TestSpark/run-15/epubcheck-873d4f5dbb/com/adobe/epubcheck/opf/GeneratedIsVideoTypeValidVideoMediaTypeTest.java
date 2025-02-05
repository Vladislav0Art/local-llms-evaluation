package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsVideoTypeValidVideoMediaTypeTest {

    //isAudioType tests

    @Test
    public void isVideoTypeValidVideoMediaTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/x-ms-wmv"));
    }

}