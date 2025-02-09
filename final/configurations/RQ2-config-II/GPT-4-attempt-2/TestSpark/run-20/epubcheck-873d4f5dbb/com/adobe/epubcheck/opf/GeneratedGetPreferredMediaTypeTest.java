package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mpeg3", "test/path"));
        assertEquals("", OPFChecker30.getPreferredMediaType("", "test/path"));
    }

}