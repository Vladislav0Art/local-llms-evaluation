package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsVideoTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isVideoTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isVideoType("image/png"));
    }

}