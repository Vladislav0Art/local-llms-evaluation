package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        String result = OPFChecker30.getPreferredMediaType("font/woff2", "/fonts/MyFont.woff2");
        assertEquals("font/woff2", result);
    }

}