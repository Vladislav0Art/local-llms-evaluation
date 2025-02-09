package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeNonBlessedMimeTypeTest {

    @Test
    public void isBlessedFontTypeNonBlessedMimeTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/x-font-ttf"));
    }

}