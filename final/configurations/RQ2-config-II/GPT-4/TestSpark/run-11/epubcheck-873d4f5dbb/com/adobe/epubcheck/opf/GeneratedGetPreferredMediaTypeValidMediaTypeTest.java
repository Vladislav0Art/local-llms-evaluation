package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeValidMediaTypeTest {

    @Test
    public void getPreferredMediaTypeValidMediaTypeTest() {
        String type = "image/svg+xml";
        String path = "image/path";
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, path);
        assertEquals(type, preferredMediaType);
    }

}