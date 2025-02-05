package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeValidCommonVideoMediaTypeTest {

    //isAudioType tests

    @Test
    public void isCommonVideoTypeValidCommonVideoMediaTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

}