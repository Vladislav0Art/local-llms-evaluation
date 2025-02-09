package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsCoreMediaTypeInvalidTypeTest {

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        assertEquals(false, OPFChecker30.isCoreMediaType("image/bmp"));
    }

}