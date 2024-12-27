package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import org.mockito.Mockito;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("wrongType"));
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

}