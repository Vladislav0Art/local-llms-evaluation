package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlessedAudioTypeValidBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeValidBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/ogg"));
    }

}