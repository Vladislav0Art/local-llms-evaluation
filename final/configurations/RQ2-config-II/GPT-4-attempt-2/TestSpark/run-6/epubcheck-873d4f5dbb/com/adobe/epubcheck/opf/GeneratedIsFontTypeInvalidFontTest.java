package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsFontTypeInvalidFontTest {

    @Test
    public void isFontTypeInvalidFontTest() {
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

}