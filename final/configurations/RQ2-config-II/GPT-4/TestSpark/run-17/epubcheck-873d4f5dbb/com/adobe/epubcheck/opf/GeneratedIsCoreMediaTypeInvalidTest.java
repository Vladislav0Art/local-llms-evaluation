package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeInvalidTest {

    @Test
    public void isCoreMediaTypeInvalidTest() {
        assertFalse(OPFChecker30.isCoreMediaType("font/opentype"));
    }

}