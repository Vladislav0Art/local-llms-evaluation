package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeFalseTest {

    @Test
    public void isBlessedFontTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedFontType("font/otf"));
    }

}