package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedFontTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isBlessedFontTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isBlessedFontType("application/json"));
    }

}