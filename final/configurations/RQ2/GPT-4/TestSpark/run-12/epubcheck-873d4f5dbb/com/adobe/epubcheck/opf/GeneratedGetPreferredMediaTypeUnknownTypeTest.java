package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeUnknownTypeTest {

    @Test
    public void getPreferredMediaTypeUnknownTypeTest() {
        assertEquals("application/octet-stream", OPFChecker30.getPreferredMediaType("image/unknown", "/path/to/file.unknown"));
    }

}