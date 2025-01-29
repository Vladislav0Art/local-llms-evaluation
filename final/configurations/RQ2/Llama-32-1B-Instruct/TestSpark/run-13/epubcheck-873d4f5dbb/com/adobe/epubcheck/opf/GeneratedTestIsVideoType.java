package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/mp4");
        result = OPFChecker30.isVideoType("video/mp4");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/ogg");
        result = OPFChecker30.isVideoType("video/ogg");
        assertTrue(result);
    }

}