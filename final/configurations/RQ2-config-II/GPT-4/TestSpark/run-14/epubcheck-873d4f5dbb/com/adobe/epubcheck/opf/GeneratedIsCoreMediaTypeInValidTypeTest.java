package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeInValidTypeTest {

    @Test
    public void isCoreMediaTypeInValidTypeTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/xyz"));
    }

}