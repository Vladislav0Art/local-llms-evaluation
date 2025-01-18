package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeInvalidTypeTest {

    @Test
    public void isBlessedAudioTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/abc"));
    }

}