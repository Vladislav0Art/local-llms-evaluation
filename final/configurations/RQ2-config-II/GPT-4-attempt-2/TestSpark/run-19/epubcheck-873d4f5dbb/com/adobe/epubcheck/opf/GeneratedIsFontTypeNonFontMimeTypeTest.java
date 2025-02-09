package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeNonFontMimeTypeTest {

    @Test
    public void isFontTypeNonFontMimeTypeTest() {
        assertFalse(OPFChecker30.isFontType("text/plain"));
    }

}