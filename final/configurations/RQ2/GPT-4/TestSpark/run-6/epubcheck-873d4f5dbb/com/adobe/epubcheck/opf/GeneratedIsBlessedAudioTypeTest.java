package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audi/flac"));
    }

}