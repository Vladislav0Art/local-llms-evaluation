package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeTest() {
        boolean result = OPFChecker30.isCoreMediaType("application/epub+zip");
        assertTrue(result);
    }

}