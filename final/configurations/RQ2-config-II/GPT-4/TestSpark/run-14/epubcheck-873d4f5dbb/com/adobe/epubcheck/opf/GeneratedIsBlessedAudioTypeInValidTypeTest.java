package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedAudioTypeInValidTypeTest {

    @Test
    public void isBlessedAudioTypeInValidTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/xyz"));
    }

}