package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeCorePreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeCorePreferredMediaTypeTest() {
        assertEquals("text/html", OPFChecker30.getPreferredMediaType("text/plain", "index.html"));
    }

}