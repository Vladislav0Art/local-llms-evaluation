package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsCoreMediaTypeValidCoreMediaTest {

    @Test
    public void isCoreMediaTypeValidCoreMediaTest() {
        assertTrue(OPFChecker30.isCoreMediaType("text/html"));
    }

}