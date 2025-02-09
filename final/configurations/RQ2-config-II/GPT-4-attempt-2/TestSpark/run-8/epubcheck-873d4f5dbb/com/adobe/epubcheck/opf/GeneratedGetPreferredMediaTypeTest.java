package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mpeg", "path/to/file"));
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("unknown", "path/to/file.mp3"));
        assertEquals("unknown", OPFChecker30.getPreferredMediaType("unknown", "path/to/file.unknown"));
    }

}