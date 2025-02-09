package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeNonCorePreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeNonCorePreferredMediaTypeTest() {
        assertEquals("application/octet-stream", OPFChecker30.getPreferredMediaType("application/octet-stream", "index.data"));
    }

}