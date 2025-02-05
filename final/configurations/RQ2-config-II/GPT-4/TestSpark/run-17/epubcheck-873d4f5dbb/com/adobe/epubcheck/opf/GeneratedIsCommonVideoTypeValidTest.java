package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCommonVideoTypeValidTest {

    @Test
    public void isCommonVideoTypeValidTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

}