package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeInvalidTest {

    @Test
    public void isFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isFontType("text/xml"));
    }

}