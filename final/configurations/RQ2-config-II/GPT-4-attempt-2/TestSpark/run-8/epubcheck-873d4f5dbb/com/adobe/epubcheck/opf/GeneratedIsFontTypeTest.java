package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/woff"));
        assertFalse(OPFChecker30.isFontType("font/otf"));
    }

}