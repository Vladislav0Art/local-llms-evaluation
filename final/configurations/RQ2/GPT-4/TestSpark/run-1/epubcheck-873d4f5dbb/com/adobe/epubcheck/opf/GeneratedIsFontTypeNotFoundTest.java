package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsFontTypeNotFoundTest {

    @Test
    public void isFontTypeNotFoundTest() {
        assertFalse(OPFChecker30.isFontType("unknownType"));
    }

}