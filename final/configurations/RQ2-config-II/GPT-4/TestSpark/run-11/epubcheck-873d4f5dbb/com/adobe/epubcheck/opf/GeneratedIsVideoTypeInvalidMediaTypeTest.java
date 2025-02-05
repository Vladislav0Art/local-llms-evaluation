package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsVideoTypeInvalidMediaTypeTest {

    @Test
    public void isVideoTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isVideoType("invalid/video"));
    }

}