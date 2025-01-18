package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsFontTypeInvalidFontTypeTest {

    @Test
    public void isFontTypeInvalidFontTypeTest() {
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

}