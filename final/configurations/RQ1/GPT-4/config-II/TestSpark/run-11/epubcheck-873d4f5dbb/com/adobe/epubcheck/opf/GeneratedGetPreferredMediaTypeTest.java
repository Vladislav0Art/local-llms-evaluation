package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("font/ttf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "testpath.ttf"));
        assertEquals("font/woff", OPFChecker30.getPreferredMediaType("application/font-woff", "testpath.woff"));
        assertNull(OPFChecker30.getPreferredMediaType("application/octet-stream", "testpath.bin"));
    }

}