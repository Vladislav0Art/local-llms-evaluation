package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeValidTypeTest {

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}