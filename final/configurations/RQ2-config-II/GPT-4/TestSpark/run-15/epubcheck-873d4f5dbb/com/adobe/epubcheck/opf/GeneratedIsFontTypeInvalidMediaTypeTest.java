package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isFontTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isFontType("text/css"));
    }

}