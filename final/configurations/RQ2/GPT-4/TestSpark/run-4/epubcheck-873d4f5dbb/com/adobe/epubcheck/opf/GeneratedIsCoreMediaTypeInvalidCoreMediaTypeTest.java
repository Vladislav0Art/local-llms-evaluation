package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsCoreMediaTypeInvalidCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeInvalidCoreMediaTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/pdf"));
    }

}