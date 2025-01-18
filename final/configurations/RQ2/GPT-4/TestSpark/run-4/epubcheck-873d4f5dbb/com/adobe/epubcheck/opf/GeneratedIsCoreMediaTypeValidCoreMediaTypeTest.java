package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsCoreMediaTypeValidCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeValidCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

}