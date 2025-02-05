package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeInvalidMediaTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidMediaTypeTest() {
        String type = "image/invalid";
        String path = "image/path";
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, path);
        assertEquals("application/octet-stream", preferredMediaType);
    }

}