package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("font/woff2"));
        assertFalse(OPFChecker30.isCoreMediaType("image/gif"));
    }

}