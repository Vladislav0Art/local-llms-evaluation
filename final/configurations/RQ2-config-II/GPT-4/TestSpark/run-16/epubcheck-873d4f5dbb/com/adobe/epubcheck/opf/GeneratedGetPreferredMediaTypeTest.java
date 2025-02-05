package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("audio/mp4", OPFChecker30.getPreferredMediaType("audio/mp4", "/path/to/media"));
        assertEquals("Fallback", OPFChecker30.getPreferredMediaType("NonExistentMimeType", "/path/to/media/WrongType.mp4"));
    }

}