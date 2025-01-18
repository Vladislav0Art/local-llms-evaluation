package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "/path/to/file.xhtml"));
        assertEquals("application/x-dtbncx+xml", OPFChecker30.getPreferredMediaType("text/xml", "/path/to/file.ncx"));
    }

}