package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsFontType_FontTypes Test {

    @Test
    public void isFontType_FontTypes

    Test() {
        assertTrue(OPFChecker30.isFontType("font"));
        assertFalse(OPFChecker30.isFontType("video"));
    }

}