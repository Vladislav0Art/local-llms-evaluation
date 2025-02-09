package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeTrueTest {

    @Test
    public void isFontTypeTrueTest() {
        assertTrue(OPFChecker30.isFontType("font/otf"));
    }

}