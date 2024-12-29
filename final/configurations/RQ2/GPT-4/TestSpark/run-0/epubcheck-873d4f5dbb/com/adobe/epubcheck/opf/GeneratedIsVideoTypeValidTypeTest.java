package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsVideoTypeValidTypeTest {

    @Test
    public void isVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mpeg"));
    }

}