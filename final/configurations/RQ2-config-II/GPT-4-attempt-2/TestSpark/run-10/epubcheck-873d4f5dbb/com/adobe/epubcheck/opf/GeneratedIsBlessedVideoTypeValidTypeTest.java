package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedVideoTypeValidTypeTest {

    @Test
    public void isBlessedVideoTypeValidTypeTest() {
        assertEquals(true, OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}