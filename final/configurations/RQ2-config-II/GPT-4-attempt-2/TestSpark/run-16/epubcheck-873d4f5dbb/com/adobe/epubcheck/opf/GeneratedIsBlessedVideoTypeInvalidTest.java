package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedVideoTypeInvalidTest {

    @Test
    public void isBlessedVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/xyz"));
    }

}