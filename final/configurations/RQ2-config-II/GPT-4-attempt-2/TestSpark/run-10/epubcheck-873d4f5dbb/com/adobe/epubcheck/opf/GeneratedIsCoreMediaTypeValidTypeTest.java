package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsCoreMediaTypeValidTypeTest {

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        assertEquals(true, OPFChecker30.isCoreMediaType("image/jpeg"));
    }

}