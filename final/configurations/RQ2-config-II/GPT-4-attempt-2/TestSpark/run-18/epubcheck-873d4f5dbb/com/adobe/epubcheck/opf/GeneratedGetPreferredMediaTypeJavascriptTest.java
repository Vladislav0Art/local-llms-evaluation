package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeJavascriptTest {

    @Test
    public void getPreferredMediaTypeJavascriptTest() {
        assertEquals("application/javascript", OPFChecker30.getPreferredMediaType("text/javascript", "path.js"));
    }

}