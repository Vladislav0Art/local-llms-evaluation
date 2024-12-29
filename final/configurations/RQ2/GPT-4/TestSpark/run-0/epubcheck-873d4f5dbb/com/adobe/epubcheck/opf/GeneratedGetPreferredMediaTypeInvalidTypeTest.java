package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeInvalidTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        assertEquals("", OPFChecker30.getPreferredMediaType("audio/wav", "/path/to/file"));
    }

}