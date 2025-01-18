package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlessedFontTypeValidBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeValidBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("application/vnd.ms-fontobject"));
    }

}