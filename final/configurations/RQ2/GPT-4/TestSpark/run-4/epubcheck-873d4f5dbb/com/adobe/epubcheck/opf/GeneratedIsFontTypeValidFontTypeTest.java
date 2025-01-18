package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsFontTypeValidFontTypeTest {

    @Test
    public void isFontTypeValidFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/vnd.ms-fontobject"));
    }

}