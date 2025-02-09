package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeFalseTest {

    @Test
    public void isBlessedAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/invalid"));
    }

}