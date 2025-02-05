package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeInvalidTest {

    @Test
    public void isFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isFontType("audio/mp4"));
    }

}