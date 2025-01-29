package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsCommonVideoType {

    @Before
    public void setup() {
        profile = new OPFProfile();
    }

    @Test
    public void testIsCommonVideoType() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        assertFalse(OPFChecker30.isCommonVideoType("image/jpg"));
    }

}