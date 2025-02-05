package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPreferredMediaTypeCoreMediaTypeTest {

    @Test
    public void getPreferredMediaTypeCoreMediaTypeTest() {
        String type = "application/xhtml+xml";
        String path = "";
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType(type, path));
    }

}