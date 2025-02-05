package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeValidFontMediaTypeTest {

    //isAudioType tests

    @Test
    public void isFontTypeValidFontMediaTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/otf"));
    }

}