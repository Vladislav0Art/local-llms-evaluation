package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaTypeInvalidTest {

    @Test
    public void isCoreMediaTypeInvalidTest() {
        assertFalse(OPFChecker30.isCoreMediaType("application/vmd.ms-powerpoint"));
    }

}