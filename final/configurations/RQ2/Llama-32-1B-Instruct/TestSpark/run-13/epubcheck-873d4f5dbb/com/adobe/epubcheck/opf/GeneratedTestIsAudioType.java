package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsAudioType {

    @Test
    public void testIsAudioType() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isAudioType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/mpeg");
        result = OPFChecker30.isAudioType("audio/mpeg");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/ogg");
        result = OPFChecker30.isAudioType("audio/ogg");
        assertTrue(result);
    }

}