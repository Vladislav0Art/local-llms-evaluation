package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeValidTest {

    @Test
    public void isCoreMediaTypeValidTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
    }

}