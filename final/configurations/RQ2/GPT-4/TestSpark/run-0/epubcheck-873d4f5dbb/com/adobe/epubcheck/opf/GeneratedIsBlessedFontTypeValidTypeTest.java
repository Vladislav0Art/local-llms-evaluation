package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedFontTypeValidTypeTest {

    @Test
    public void isBlessedFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/woff"));
    }

}