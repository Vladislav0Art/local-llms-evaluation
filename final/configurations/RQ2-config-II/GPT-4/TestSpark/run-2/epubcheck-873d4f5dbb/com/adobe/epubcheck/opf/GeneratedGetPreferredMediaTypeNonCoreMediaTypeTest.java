package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPreferredMediaTypeNonCoreMediaTypeTest {

    @Test
    public void getPreferredMediaTypeNonCoreMediaTypeTest() {
        String type = "application/xml";
        String path = "";
        assertEquals("application/xml", OPFChecker30.getPreferredMediaType(type, path));
    }

}