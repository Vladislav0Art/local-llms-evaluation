package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import org.mockito.Mockito;

public class GeneratedIsBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("wrongType"));
        assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
    }

}