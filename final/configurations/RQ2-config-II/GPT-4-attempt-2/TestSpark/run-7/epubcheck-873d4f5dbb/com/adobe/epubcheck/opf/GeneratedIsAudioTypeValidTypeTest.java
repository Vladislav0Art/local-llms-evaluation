package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsAudioTypeValidTypeTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

}