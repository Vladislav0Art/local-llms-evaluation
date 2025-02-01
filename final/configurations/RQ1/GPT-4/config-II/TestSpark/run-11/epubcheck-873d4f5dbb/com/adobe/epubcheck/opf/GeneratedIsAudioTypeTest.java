package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

}