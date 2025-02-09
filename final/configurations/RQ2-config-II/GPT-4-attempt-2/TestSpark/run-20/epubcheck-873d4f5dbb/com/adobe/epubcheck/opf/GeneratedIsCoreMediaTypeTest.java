package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/css"));
        assertFalse(OPFChecker30.isCoreMediaType("application/vnd.ms-excel"));
    }

}