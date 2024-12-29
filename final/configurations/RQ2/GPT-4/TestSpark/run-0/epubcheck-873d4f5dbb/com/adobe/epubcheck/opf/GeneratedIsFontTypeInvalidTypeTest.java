package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsFontTypeInvalidTypeTest {

    @Test
    public void isFontTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isFontType("font/jpg"));
    }

}