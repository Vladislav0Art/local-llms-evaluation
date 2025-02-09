package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsBlessedVideoTypeInvalidTypeTest {

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        assertEquals(false, OPFChecker30.isBlessedVideoType("video/avi"));
    }

}