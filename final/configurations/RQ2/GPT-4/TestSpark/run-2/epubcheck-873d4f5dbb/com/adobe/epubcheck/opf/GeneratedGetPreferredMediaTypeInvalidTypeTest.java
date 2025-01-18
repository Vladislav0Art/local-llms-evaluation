package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeInvalidTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        assertNotEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "index.html"));
    }

}