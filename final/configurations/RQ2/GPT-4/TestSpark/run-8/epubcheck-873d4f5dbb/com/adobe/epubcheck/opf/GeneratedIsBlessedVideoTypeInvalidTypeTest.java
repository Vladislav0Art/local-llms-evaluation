package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeInvalidTypeTest {

    @Test
    public void isBlessedVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/invalid"));
    }

}