package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertFalse(OPFChecker30.isCommonVideoType("audio/mp3"));
    }

}