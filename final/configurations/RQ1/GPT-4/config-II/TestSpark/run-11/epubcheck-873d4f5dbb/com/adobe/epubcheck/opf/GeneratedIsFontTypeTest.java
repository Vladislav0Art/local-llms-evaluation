package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/woff2"));
        assertFalse(OPFChecker30.isFontType("audio/mpeg"));
    }

}