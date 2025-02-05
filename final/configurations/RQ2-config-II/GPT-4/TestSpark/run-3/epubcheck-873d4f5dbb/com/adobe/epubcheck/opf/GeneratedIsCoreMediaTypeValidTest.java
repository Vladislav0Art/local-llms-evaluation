package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeValidTest {

    @Test
    public void isCoreMediaTypeValidTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/xml"));
    }

}