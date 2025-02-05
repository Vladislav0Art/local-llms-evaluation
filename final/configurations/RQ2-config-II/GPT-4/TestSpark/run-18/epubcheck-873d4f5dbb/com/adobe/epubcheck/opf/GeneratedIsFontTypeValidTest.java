package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeValidTest {

    @Test
    public void isFontTypeValidTest() {
        assertTrue(OPFChecker30.isFontType("application/vnd.ms-fontobject"));
    }

}