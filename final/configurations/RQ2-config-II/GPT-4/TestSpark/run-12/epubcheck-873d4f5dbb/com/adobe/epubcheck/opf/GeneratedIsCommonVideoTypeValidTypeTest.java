package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeValidTypeTest {

    @Test
    public void isCommonVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

}