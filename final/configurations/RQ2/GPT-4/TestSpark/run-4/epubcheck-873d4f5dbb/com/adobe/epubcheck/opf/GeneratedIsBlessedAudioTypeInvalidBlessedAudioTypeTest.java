package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlessedAudioTypeInvalidBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeInvalidBlessedAudioTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/pdf"));
    }

}