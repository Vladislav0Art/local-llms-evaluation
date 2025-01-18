package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeValidTypeTest {

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "index.xhtml"));
    }

}