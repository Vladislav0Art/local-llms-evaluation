package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeAnyTypeTest {

    @Test
    public void getPreferredMediaTypeAnyTypeTest() {
        assertEquals("text/plain", OPFChecker30.getPreferredMediaType("any/type", "sample/path"));
    }

}