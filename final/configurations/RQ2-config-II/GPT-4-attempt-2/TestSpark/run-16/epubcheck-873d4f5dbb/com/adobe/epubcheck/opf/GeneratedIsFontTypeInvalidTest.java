package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeInvalidTest {

    @Test
    public void isFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isFontType("font/abc"));
    }

}