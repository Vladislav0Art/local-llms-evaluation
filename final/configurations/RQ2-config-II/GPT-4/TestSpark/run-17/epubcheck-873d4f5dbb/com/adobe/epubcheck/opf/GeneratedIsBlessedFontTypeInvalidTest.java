package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedFontTypeInvalidTest {

    @Test
    public void isBlessedFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedFontType("audio/mp4"));
    }

}