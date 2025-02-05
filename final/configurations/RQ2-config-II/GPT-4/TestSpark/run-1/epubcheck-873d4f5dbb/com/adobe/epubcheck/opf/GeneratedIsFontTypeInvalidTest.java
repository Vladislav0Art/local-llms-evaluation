package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFontTypeInvalidTest {

    @Test
    public void isFontTypeInvalidTest() {
        assertFalse(OPFChecker30.isFontType("image/png"));
    }

}