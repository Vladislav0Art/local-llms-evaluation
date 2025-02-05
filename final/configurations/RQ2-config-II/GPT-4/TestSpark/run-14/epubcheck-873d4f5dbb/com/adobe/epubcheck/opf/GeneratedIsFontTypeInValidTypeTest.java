package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeInValidTypeTest {

    @Test
    public void isFontTypeInValidTypeTest() {
        assertFalse(OPFChecker30.isFontType("application/xyz"));
    }

}