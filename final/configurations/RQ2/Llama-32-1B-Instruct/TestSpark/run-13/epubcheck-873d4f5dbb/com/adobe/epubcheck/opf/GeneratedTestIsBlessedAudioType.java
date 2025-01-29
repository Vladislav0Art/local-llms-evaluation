package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsBlessedAudioType {

    @Test
    public void testIsBlessedAudioType() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/mpeg");
        result = OPFChecker30.isBlessedAudioType("audio/mpeg");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("audio/ogg");
        result = OPFChecker30.isBlessedAudioType("audio/ogg");
        assertTrue(result);
    }

}