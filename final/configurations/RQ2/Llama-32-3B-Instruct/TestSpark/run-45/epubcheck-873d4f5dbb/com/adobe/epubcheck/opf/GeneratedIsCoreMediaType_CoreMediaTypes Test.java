package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsCoreMediaType_CoreMediaTypes Test {

    @Test
    public void isCoreMediaType_CoreMediaTypes

    Test() {
        assertTrue(OPFChecker30.isCoreMediaType("core media"));
        assertFalse(OPFChecker30.isCoreMediaType("other core media"));
    }

}