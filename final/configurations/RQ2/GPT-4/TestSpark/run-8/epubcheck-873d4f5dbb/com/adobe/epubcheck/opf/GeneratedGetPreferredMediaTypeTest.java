package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        String preferredMediaType = OPFChecker30.getPreferredMediaType("video/mp4", "/test/video");
        assertEquals("video/mp4", preferredMediaType);
    }

}