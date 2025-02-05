package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeValidTest {

    @Test
    public void isBlessedVideoTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}