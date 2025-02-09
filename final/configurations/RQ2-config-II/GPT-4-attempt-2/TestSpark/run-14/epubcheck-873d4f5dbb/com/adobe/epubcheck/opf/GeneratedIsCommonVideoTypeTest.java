package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeTest() {
        boolean result = OPFChecker30.isCommonVideoType("video/mp4");
        assertTrue(result);
    }

}