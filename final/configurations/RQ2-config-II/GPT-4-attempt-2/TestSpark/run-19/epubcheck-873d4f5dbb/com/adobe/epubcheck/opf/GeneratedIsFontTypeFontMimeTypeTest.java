package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeFontMimeTypeTest {

    @Test
    public void isFontTypeFontMimeTypeTest() {
        assertTrue(OPFChecker30.isFontType("application/x-font-ttf"));
    }

}