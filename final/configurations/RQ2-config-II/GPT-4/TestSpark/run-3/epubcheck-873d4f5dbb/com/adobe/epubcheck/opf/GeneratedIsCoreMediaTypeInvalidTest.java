package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeInvalidTest {

    @Test
    public void isCoreMediaTypeInvalidTest() {
        assertFalse(OPFChecker30.isCoreMediaType("font/woff"));
    }

}