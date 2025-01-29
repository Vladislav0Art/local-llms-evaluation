package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsBlessedVideoType {

    @Test
    public void testIsBlessedVideoType() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/mp4");
        result = OPFChecker30.isBlessedVideoType("video/mp4");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/ogg");
        result = OPFChecker30.isBlessedVideoType("video/ogg");
        assertTrue(result);
    }

}