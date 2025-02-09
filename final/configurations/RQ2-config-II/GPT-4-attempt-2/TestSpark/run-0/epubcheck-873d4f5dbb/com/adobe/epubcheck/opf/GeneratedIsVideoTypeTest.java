package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isVideoType("video/mpeg");
        assertTrue(result);
    }

}