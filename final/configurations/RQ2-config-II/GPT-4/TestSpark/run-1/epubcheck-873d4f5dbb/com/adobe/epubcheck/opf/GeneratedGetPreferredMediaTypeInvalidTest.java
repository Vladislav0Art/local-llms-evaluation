package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeInvalidTest {

    @Test
    public void getPreferredMediaTypeInvalidTest() {
        assertNotEquals("text/html", OPFChecker30.getPreferredMediaType("text/xml", "index.html"));
    }

}