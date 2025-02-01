package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedIsBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff2"));
        assertFalse(OPFChecker30.isBlessedFontType("font/unknown"));
    }

}