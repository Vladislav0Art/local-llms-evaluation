package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import org.mockito.Mockito;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        assertFalse(OPFChecker30.isFontType("wrongType"));
        assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

}