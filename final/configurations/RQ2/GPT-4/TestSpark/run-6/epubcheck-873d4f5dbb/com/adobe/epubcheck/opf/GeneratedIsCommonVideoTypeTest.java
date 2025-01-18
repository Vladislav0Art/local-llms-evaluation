package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertTrue(OPFChecker30.isCommonVideoType("video/webm"));
        assertFalse(OPFChecker30.isCommonVideoType("video/avi"));
    }

}