package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeValidTest {

    @Test
    public void isCoreMediaTypeValidTest() {
        assertTrue(OPFChecker30.isCoreMediaType("image/jpeg"));
    }

}