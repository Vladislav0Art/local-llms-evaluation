package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeTextFileTest {

    @Test
    public void getPreferredMediaTypeTextFileTest() {
        assertEquals("application/octet-stream", OPFChecker30.getPreferredMediaType("text/plain", "sample.txt"));
    }

}