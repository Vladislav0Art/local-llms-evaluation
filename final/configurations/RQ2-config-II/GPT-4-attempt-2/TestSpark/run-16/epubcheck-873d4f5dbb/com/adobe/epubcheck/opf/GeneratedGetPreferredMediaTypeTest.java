package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("image/jpeg", OPFChecker30.getPreferredMediaType("image/jpg", "path/to/file.jpg"));
    }

}