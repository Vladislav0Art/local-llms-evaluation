package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeInvalidTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        String type = "some/invalidtype";
        String path = "/path/to/file";
        String expected = "application/octet-stream";
        assertEquals(expected, OPFChecker30.getPreferredMediaType(type, path));
    }

}