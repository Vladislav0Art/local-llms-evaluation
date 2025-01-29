package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestGetPreferredMediaType {

    @Test
    public void testGetPreferredMediaType() {
        String type = "audio/mpeg";
        String expected = "audio/mpeg";
        when(Reference.class.getCanonicalName()).thenReturn("audio/mpeg");

        assertEquals(expected, OPFChecker30.getPreferredMediaType(type));
    }

}