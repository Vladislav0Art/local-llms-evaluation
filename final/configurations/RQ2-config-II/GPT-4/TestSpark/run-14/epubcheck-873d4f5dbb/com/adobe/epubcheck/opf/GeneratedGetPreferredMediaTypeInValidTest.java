package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeInValidTest {

    @Test
    public void getPreferredMediaTypeInValidTest() {
        assertEquals("text/html", OPFChecker30.getPreferredMediaType("text/xyz", "index.html"));
    }

}