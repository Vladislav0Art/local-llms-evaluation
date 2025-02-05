package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeValidTypeTest {

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        String type = "audio/mpeg";
        String path = "/path/to/audio";
        String expected = "audio/mpeg";
        assertEquals(expected, OPFChecker30.getPreferredMediaType(type, path));
    }

}