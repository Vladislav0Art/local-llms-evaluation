package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertFalse(opfChecker30.checkContent());
    }

}