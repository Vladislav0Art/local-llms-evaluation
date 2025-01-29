package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestIsCommonVideoType {

    @Test
    public void testIsCommonVideoType() {
        String type = "video/webm";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertTrue(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/webm");
        result = OPFChecker30.isCommonVideoType("video/webm");
        assertFalse(result);

        when(Reference.class.getCanonicalName()).thenReturn("video/ogg");
        result = OPFChecker30.isCommonVideoType("video/ogg");
        assertTrue(result);
    }

}