package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void IsCoreMediaTypeTest() {
        String type = "application/xhtml+xml";
        assertTrue(OPFChecker30.isCoreMediaType(type));
    }

}