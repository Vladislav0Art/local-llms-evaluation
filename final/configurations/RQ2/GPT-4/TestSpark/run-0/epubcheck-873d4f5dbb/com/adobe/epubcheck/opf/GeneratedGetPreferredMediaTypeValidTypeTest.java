package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeValidTypeTest {

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        assertEquals("audio/mp4", OPFChecker30.getPreferredMediaType("audio/mp4", "/path/to/file"));
    }

}