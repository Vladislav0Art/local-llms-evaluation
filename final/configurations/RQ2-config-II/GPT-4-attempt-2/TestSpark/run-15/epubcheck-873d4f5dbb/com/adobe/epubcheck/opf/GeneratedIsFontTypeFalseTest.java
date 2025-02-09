package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsFontTypeFalseTest {

    @Test
    public void isFontTypeFalseTest() {
        assertFalse(OPFChecker30.isFontType("application/pdf"));
    }

}