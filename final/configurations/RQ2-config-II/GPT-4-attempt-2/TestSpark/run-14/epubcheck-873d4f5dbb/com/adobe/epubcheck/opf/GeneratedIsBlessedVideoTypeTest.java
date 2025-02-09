package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeTest {

    @Test
    public void isBlessedVideoTypeTest() {
        boolean result = OPFChecker30.isBlessedVideoType("video/mp4");
        assertTrue(result);
    }

}