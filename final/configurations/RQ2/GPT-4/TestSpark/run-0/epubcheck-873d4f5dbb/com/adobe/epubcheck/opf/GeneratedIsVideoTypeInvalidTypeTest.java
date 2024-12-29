package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsVideoTypeInvalidTypeTest {

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("video/flv"));
    }

}