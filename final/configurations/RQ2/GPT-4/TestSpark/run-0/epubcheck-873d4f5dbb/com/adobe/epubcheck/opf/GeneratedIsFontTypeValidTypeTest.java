package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsFontTypeValidTypeTest {

    @Test
    public void isFontTypeValidTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

}