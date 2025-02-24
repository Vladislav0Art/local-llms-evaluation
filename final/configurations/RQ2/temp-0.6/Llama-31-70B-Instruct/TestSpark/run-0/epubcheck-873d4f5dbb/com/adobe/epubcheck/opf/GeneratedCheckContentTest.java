package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        assertTrue(opfChecker30.checkContent());
    }

}