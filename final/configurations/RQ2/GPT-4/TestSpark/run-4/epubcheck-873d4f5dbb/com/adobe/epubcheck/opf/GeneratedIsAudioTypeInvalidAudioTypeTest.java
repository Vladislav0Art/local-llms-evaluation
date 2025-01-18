package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsAudioTypeInvalidAudioTypeTest {

    @Test
    public void isAudioTypeInvalidAudioTypeTest() {
        assertFalse(OPFChecker30.isAudioType("audio/pdf"));
    }

}