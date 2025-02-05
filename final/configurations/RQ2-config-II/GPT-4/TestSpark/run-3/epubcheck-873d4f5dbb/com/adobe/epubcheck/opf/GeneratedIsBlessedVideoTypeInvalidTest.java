package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeInvalidTest {

    @Test
    public void isBlessedVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("audio/mp3"));
    }

}