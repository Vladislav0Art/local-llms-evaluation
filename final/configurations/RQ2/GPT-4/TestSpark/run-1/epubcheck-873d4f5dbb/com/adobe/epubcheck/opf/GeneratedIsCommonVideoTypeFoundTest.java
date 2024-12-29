package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsCommonVideoTypeFoundTest {

    @Test
    public void isCommonVideoTypeFoundTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

}