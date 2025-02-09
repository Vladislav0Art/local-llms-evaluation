package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsCoreMediaTypeInvalidCoreMediaTest {

    @Test
    public void isCoreMediaTypeInvalidCoreMediaTest() {
        assertFalse(OPFChecker30.isCoreMediaType("text/plain"));
    }

}