package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedAudioTypeInvalidTest {

    @Test
    public void isBlessedAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("text/html"));
    }

}