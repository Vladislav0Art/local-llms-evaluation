package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedGetPreferredMediaTypeInvalidTest {

    @Test
    public void getPreferredMediaTypeInvalidTest() {
        assertNotEquals("text/html", OPFChecker30.getPreferredMediaType("text/html", "index.html"));
    }

}