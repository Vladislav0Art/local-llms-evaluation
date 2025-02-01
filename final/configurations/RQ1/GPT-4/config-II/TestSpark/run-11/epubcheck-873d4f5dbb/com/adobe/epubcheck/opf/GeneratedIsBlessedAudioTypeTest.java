package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

}